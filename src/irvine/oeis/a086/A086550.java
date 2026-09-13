package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.InverseSequence;
import irvine.oeis.Sequence2;

/**
 * A086550 Smallest k such that tau(k) - tau(k-1) = n, where tau(k) = number of divisors of k, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A086550 extends InverseSequence {

  /** Construct the sequence. */
  public A086550() {
    super(0, 0, new Sequence2() {
      private long mN = 0;
      @Override
      public Z next() {
        return Functions.SIGMA0.z(++mN + 1).subtract(Functions.SIGMA0.z(mN));
      }
    });
  }
}
