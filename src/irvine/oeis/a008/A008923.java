package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008923 Euler's family of solutions to n = x^4 + y^4 = z^4 + w^4.
 * @author Sean A. Irvine
 */
public class A008923 implements Sequence {

  private long mA = 0;
  private long mB = 0;
  // Arrays allocated once to avoid churn
  private final Z[] mAPowers = new Z[8];
  private final Z[] mBPowers = new Z[8];

  private void vec(final Z[] v, final long a) {
    v[0] = Z.ONE;
    for (int k = 1; k < v.length; ++k) {
      v[k] = v[k - 1].multiply(a);
    }
  }

  private Z x(final Z[] a, final Z[] b) {
    return a[7]
      .add(a[5].multiply(b[2]))
      .subtract(a[3].multiply(b[4]).multiply2())
      .add(a[2].multiply(b[5]).multiply(3))
      .add(a[1].multiply(b[6]));
  }

  private Z y(final Z[] a, final Z[] b) {
    return a[6].multiply(b[1])
      .subtract(a[5].multiply(b[2]).multiply(3))
      .subtract(a[4].multiply(b[3]).multiply2())
      .add(a[2].multiply(b[5]))
      .add(b[7]);
  }

//  private Z z(final Z[] a, final Z[] b) {
//    return a[7]
//      .add(a[5].multiply(b[2]))
//      .subtract(a[3].multiply(b[4]).multiply2())
//      .subtract(a[2].multiply(b[5]).multiply(3))
//      .add(a[1].multiply(b[6]));
//  }

  private Z w(final Z[] a, final Z[] b) {
    return a[6].multiply(b[1])
      .add(a[5].multiply(b[2]).multiply(3))
      .subtract(a[4].multiply(b[3]).multiply2())
      .add(a[2].multiply(b[5]))
      .add(b[7]);
  }

  @Override
  public Z next() {
    while (true) {
      if (++mB > mA) {
        vec(mAPowers, ++mA);
        mB = 1;
      }
      vec(mBPowers, mB);
      final Z x = x(mAPowers, mBPowers);
      if (x.signum() > 0) {
        final Z w = w(mAPowers, mBPowers);
        if (!x.equals(w)) {
          final Z y = y(mAPowers, mBPowers);
          if (y.signum() > 0 && !y.equals(w)) {
            return x.pow(4).add(y.pow(4));
          }
        }
      }
    }
  }
}
