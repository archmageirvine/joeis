package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.array.MultidimensionalIntArray;

/**
 * A060589.
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

  void recFill2(int a, int b, int c, int d, int e) {
    if (a == b) {
      a = 0;
      ++b;
      if (b == c) {
        b = 1;
        ++c;
        if (c == d) {
          c = 2;
          ++d;
          if (d == e) {
            d = 3;
            ++e;
          }
        }
      }
    }
    if (e == mN) {
      ++mCnt;
    } else {
      for (int v = -1; v <= 1; v += 2) {
        mX.set(new int[] {a, b, c, d, e}, v);
        if (testValid(a, b, c, d, e)) {
          recFill2(a + 1, b, c, d, e);
        }
        mX.set(new int[] {a, b, c, d, e}, 0);
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mCnt = 0;
    mX = new MultidimensionalIntArray(mN, mN, mN, mN, mN);
    recFill2(0, 1, 2, 3, 4);
    return Z.valueOf(mCnt);
  }
}
