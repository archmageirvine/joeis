package irvine.oeis.a080;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.InverseSequence;
import irvine.oeis.Sequence1;

/**
 * A080390 Least k such that gcd(k+1, binomial(k, k/2)) = n.
 * @author Sean A. Irvine
 */
public class A080390 extends InverseSequence {

  /** Construct the sequence. */
  public A080390() {
    super(1, new Sequence1() {
      private long mN = 0;
      @Override
      public Z next() {
        return Binomial.binomial(++mN, mN / 2).gcd(mN + 1);
      }
    }, 1);
  }
}
