package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.PrimeSubsequence;
import irvine.oeis.a001.A001067;

/**
 * A033563 Primes in <code>A001067</code>.
 * @author Sean A. Irvine
 */
public class A033563 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A033563() {
    super(new A001067() {
      @Override
      public Z next() {
        return super.next().abs();
      }
    });
  }
}
