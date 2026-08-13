package irvine.oeis.a086;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086261 Number of antisymmetric n X n conference matrices.
 * @author Sean A. Irvine
 */
public class A086261 extends Sequence1 {

  // Cf. A086260

  private int mN;
  private long mCount;

  private int mV;
  private int mK;
  private int mLambda;
  private int[][] mA;

  private int outDegree(final int v) {
    int d = 0;
    for (int j = 0; j < mV; ++j) {
      if (mA[v][j] == 1) {
        ++d;
      }
    }
    return d;
  }

  private int degreeUnknown(final int v) {
    int d = 0;
    for (int j = 0; j < mV; ++j) {
      if (mA[v][j] < 0) {
        ++d;
      }
    }
    return d;
  }

  private int commonOut(final int i, final int j) {
    int c = 0;
    for (int k = 0; k < mV; ++k) {
      if (k != i && k != j
        && mA[i][k] == 1
        && mA[j][k] == 1) {
        ++c;
      }
    }
    return c;
  }

  private int possibleCommonOut(final int i, final int j) {
    int c = 0;
    for (int k = 0; k < mV; ++k) {
      if (k == i || k == j) {
        continue;
      }
      if (mA[i][k] != 0 && mA[j][k] != 0) {
        ++c;
      }
    }
    return c;
  }

  // Check whether the current partial tournament can still become doubly regular
  private boolean viable() {
    // Every vertex must eventually have outdegree k
    for (int i = 0; i < mV; ++i) {
      final int d = outDegree(i);
      final int u = degreeUnknown(i);

      if (d > mK || d + u < mK) {
        return false;
      }
    }

    // Every pair must eventually have exactly lambda common out-neighbors
    for (int i = 0; i < mV; ++i) {
      for (int j = i + 1; j < mV; ++j) {

        final int common = commonOut(i, j);
        if (common > mLambda) {
          return false;
        }

        final int possible = possibleCommonOut(i, j);
        if (possible < mLambda) {
          return false;
        }
      }
    }

    return true;
  }

  private boolean valid() {
    for (int i = 0; i < mV; ++i) {
      if (outDegree(i) != mK) {
        return false;
      }
    }
    // Doubly regular condition
    for (int i = 0; i < mV; ++i) {
      for (int j = i + 1; j < mV; ++j) {
        if (commonOut(i, j) != mLambda) {
          return false;
        }
      }
    }
    return true;
  }

  private void search(final int pos) {
    if (pos >= mV * (mV - 1) / 2) {
      if (valid()) {
        ++mCount;
      }
      return;
    }

    int p = 0;
    int i = 0;
    int j = 1;
    while (p < pos) {
      ++j;
      if (j >= mV) {
        ++i;
        j = i + 1;
      }
      ++p;
    }
    if (i == 0) {
      search(pos + 1);
      return;
    }

    // Try i -> j
    mA[i][j] = 1;
    mA[j][i] = 0;
    if (viable()) {
      search(pos + 1);
    }
    // Try j -> i
    mA[i][j] = 0;
    mA[j][i] = 1;
    if (viable()) {
      search(pos + 1);
    }
    mA[i][j] = -1;
    mA[j][i] = -1;
  }

  private long countNormalized() {
    mV = mN - 1;
    mK = (mV - 1) / 2;
    mLambda = (mV - 3) / 4;
    mA = new int[mV][mV];
    for (int i = 0; i < mV; ++i) {
      java.util.Arrays.fill(mA[i], -1);
      mA[i][i] = 0;
    }
    for (int j = 1; j < mV; ++j) {
      if (j <= mK) {
        mA[0][j] = 1;
        mA[j][0] = 0;
      } else {
        mA[0][j] = 0;
        mA[j][0] = 1;
      }
    }
    mCount = 0;
    search(0);
    return mCount;
  }

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.valueOf(mN);
    }
    if ((mN & 3) != 0) {
      return Z.ZERO;
    }
    final long normalized = countNormalized();
    final Z neighborhoodFactor = Binomial.binomial(mV - 1, mK);
    return Z.valueOf(normalized).multiply(neighborhoodFactor).shiftLeft(mN - 1);
  }
}
