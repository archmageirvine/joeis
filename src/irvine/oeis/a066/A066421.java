package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066421 a(n) = least k &gt; 0 such that sigma^(k)(n) + 1 is prime, if such k exists; otherwise 0, where sigma^(k) denotes application of sigma k times.
 * @author Sean A. Irvine
 */
public class A066421 extends Sequence1 {

  private Z mN = Z.ZERO;
  //private final PrimeDivision mFactor = new PrimeDivision();
  //private final TillmanFactorizer mFactor = new TillmanFactorizer();

  @Override
  public Z next() {
    mN = mN.add(1);
    long k = 0;
    Z t = mN;
    while (true) {
      ++k;
      try {
        //t = mFactor.factorize(t).sigma();
        t = Functions.SIGMA.z(t);
      } catch (final RuntimeException e) {
        System.err.println("Failed with k=" + k);
        throw e;
      }
      if (t.add(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }

  /**
   * Directly generate a term of this sequence.
   * @param args index of term
   */
  public static void main(final String[] args) {
    final A066421 seq = new A066421();
    seq.mN = new Z(args[0]).subtract(1);
    System.out.println(seq.next());
  }
}
