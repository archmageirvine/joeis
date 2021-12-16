package irvine.oeis.a053;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053170 Number of 3 X 3 integer matrices with elements in the range [ -n,n ] which generate a group of finite order under binary matrix multiplication.
 * @author Sean A. Irvine
 */
public class A053170 implements Sequence {

  // After Ralf W. Grosse-Kunstleve,
  // https://github.com/rwgk/stuff/tree/master/loop3x3matrices
  // Uses special 3x3 matrix routines for speed.

  protected static final int[] IDENTITY = {1, 0, 0, 0, 1, 0, 0, 0, 1};
  private int mN = 0;

  protected int det(final int[] m) {
    return m[0] * (m[4] * m[8] - m[5] * m[7]) - m[1] * (m[3] * m[8] - m[5] * m[6]) + m[2] * (m[3] * m[7] - m[4] * m[6]);
  }

  protected void multiply(final int[] res, final int[] a, final int[] b) {
    int aj = 0;
    int bj = 0;
    int k = 0;
    res[k] = a[aj++] * b[bj];
    bj += 3;
    res[k] += a[aj++] * b[bj];
    bj += 3;
    res[k] += a[aj] * b[bj];
    bj -= 5;
    ++k;
    aj = 0;
    res[k] = a[aj++] * b[bj];
    bj += 3;
    res[k] += a[aj++] * b[bj];
    bj += 3;
    res[k] += a[aj] * b[bj];
    bj -= 5;
    ++k;
    aj = 0;
    res[k] = a[aj++] * b[bj];
    bj += 3;
    res[k] += a[aj++] * b[bj];
    bj += 3;
    res[k] += a[aj++] * b[bj];
    bj = 0;
    ++k;
    // a = 3
    res[k] = a[aj++] * b[bj];
    bj += 3;
    res[k] += a[aj++] * b[bj];
    bj += 3;
    res[k] += a[aj] * b[bj];
    bj -= 5;
    ++k;
    aj = 3;
    res[k] = a[aj++] * b[bj];
    bj += 3;
    res[k] += a[aj++] * b[bj];
    bj += 3;
    res[k] += a[aj] * b[bj];
    bj -= 5;
    ++k;
    aj = 3;
    res[k] = a[aj++] * b[bj];
    bj += 3;
    res[k] += a[aj++] * b[bj];
    bj += 3;
    res[k] += a[aj++] * b[bj];
    bj = 0;
    ++k;
    // a = 6
    res[k] = a[aj++] * b[bj];
    bj += 3;
    res[k] += a[aj++] * b[bj];
    bj += 3;
    res[k] += a[aj] * b[bj];
    bj -= 5;
    ++k;
    aj = 6;
    res[k] = a[aj++] * b[bj];
    bj += 3;
    res[k] += a[aj++] * b[bj];
    bj += 3;
    res[k] += a[aj] * b[bj];
    bj -= 5;
    ++k;
    aj = 6;
    res[k] = a[aj++] * b[bj];
    bj += 3; /* r33 */
    res[k] += a[aj++] * b[bj];
    bj += 3;
    res[k] += a[aj] * b[bj];
  }

  protected boolean is(final int[] m) {
    final int det = det(m);
    if (det != 1 && det != -1) {
      return false;
    }
    int[] u = new int[9];
    int[] t = Arrays.copyOf(m, m.length);
    int k = 0;
    while (!Arrays.equals(IDENTITY, t)) {
      multiply(u, t, m);
      final int[] v = t;
      t = u;
      u = v;
      if (++k > 6) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    final int[] m = new int[9];
    for (int a = -mN; a <= mN; ++a) {
      m[0] = a;
      for (int b = -mN; b <= mN; ++b) {
        m[1] = b;
        for (int c = -mN; c <= mN; ++c) {
          m[2] = c;
          for (int d = -mN; d <= mN; ++d) {
            m[3] = d;
            for (int e = -mN; e <= mN; ++e) {
              m[4] = e;
              for (int f = -mN; f <= mN; ++f) {
                m[5] = f;
                for (int g = -mN; g <= mN; ++g) {
                  m[6] = g;
                  for (int h = -mN; h <= mN; ++h) {
                    m[7] = h;
                    for (int i = -mN; i <= mN; ++i) {
                      m[8] = i;
                      if (is(m)) {
                        ++count;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return Z.valueOf(count);
  }
}
