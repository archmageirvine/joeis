package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A002770 Integers connected with coefficients in expansion of Weierstrass P-function.
 * @author Sean A. Irvine
 */
public class A002770 extends A002306 {

  /** Construct the sequence. */
  public A002770() {
    super(2);
  }

  private final Fast mPrime = new Fast();
  private int mN = 1;

  @Override
  public Z next() {
    final Q e = hurwitz(++mN);
    final A002172 glaisher = new A002172(); // Glaisher, 2 * a
    long p = 3; // first prime to consider is 5
    Q sum = Q.ZERO;
    final long n4 = 4L * mN;
    while ((p = mPrime.nextPrime(p)) - 1 <= n4) {
      if ((p & 3) == 1) {
        // i.e. p steps through index for chi(p)
        final Z a2 = glaisher.next();
        if (n4 % (p - 1) == 0) {
          final Q t = new Q(a2.pow(n4 / (p - 1)), p);
          sum = sum.add(t);
        }
      }
    }
    //System.out.println(e + " " + mSum);
    return e.subtract(Q.HALF).subtract(sum).toZ();
  }
}
