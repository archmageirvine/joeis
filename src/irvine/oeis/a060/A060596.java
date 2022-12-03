package irvine.oeis.a060;

import java.util.Arrays;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.array.MultidimensionalIntArray;

/**
 * A060596 Number of tilings of the 4-dimensional zonotope constructed from D vectors.
 * @author Sean A. Irvine
 */
public class A060596 extends AbstractSequence {

  // After Manfred Scheucher

  /** Construct the sequence. */
  public A060596() {
    super(4);
  }

  private static final int ALLOWED_CHANGES = 1;
  private int mN = 3;
  private MultidimensionalIntArray mX;
  private long mCnt = 0;

  boolean testValid(final int... v) {
    final int[] i = new int[v.length + 1];
    final int[] s = new int[i.length];
    final int[] c = new int[v.length];
    outer:
    for (int z = 0; z < v[v.length - 1]; ++z) {
      for (int k = 0, j = 0; k < v.length; ++k) {
        if (z == v[k]) {
          continue outer;
        }
        if (z < v[k]) {
          i[j++] = z;
          while (k < v.length) {
            i[j++] = v[k++];
          }
          break;
        }
        i[j++] = v[k];
      }
      // todo no real need to store s[k]
      for (int k = 0; k < s.length; ++k) {
        for (int j = 0, h = 0; j < c.length; ++j) {
          if (h == k) {
            ++h;
          }
          c[j] = i[h++];
        }
        s[k] = mX.get(c);
        if (s[k] == 0) {
          continue outer;
        }
      }
      int changes = 0;
      for (int j = 1; j < s.length; ++j) {
        if (s[j - 1] * s[j] < 0 && ++changes > ALLOWED_CHANGES) {
          return false;
        }
      }
    }
    return true;
  }

  void recFill2(final int n, final int... v) {
    for (int k = 1; k < v.length; ++k) {
      if (v[k - 1] == v[k]) {
        v[k - 1] = k - 1;
        ++v[k];
      } else {
        break;
      }
    }
    if (v[v.length - 1] == n) {
      ++mCnt;
    } else {
      for (int u = -1; u <= 1; u += 2) {
        mX.set(v, u);
        if (testValid(v)) {
          final int[] vv = Arrays.copyOf(v, v.length);
          ++vv[0];
          recFill2(n, vv);
        }
        mX.set(v, 0);
      }
    }
  }

  protected Z count(final int d, final int n) {
    mCnt = 0;
    final int[] t = new int[d];
    Arrays.fill(t, n);
    mX = new MultidimensionalIntArray(t);
    recFill2(n, IntegerUtils.identity(new int[d]));
    return Z.valueOf(mCnt);
  }

  @Override
  public Z next() {
    return count(5, ++mN);
  }
}
