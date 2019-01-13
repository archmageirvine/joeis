package irvine.oeis.a178;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A178814.
 * @author Sean A. Irvine
 */
public class A178814 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    Z p = Z.ONE;
    long c = 0;
    while (true) {
      p = mPrime.nextPrime(p);
      if (mVerbose && (++c & 0xFFFFF) == 0) {
        System.err.println("[" + p + "]");
      }
      final Z psq = p.square();
      final Z pm = p.subtract(Z.ONE);
      if (Z.ONE.equals(n.modPow(pm, psq))) {
        return n.modPow(pm, psq.multiply(p)).subtract(Z.ONE).divide(psq);
        //        return n.pow(pm).divide(psq).mod(p);
      }
    }
  }

  /**
   * Run from a particular value.
   *
   * @param args a <code>String</code> value
   */
  public static void main(final String[] args) {
    final A178814 s = new A178814();
    s.mN = Integer.parseInt(args[0]) - 1;
    while (true) {
      System.out.println(s.next().toString());
    }
  }
}

