package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A066745 Least number of applications of <code>f(k) = k(k+1)+1</code> to n to yield a prime, if this number exists; 0 otherwise.
 * @author Sean A. Irvine
 */
public class A066745 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mVerbose) {
      System.out.println("[" + mN + "]");
    }
    Z z = mN;
    long c = 0;
    while (!z.isProbablePrime(10)) {
      ++c;
      z = z.multiply(z.add(1)).add(1);
    }
    return Z.valueOf(c);
  }

  /**
   * Print successive iterates without regard to primality test.
   *
   * @param args base, steps.
   */
  public static void main(final String[] args) {
    Z base = new Z(args[0]);
    final int count = Integer.parseInt(args[1]);
    for (int k = 0; k < count; ++k) {
      System.out.println(base.toString());
      base = base.multiply(base.add(1)).add(1);
    }
  }
}

