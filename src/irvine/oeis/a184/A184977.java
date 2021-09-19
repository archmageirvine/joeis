package irvine.oeis.a184;
// manually partsum at 2021-09-13 21:26

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a038.A038128;
/**
 * A184977 a(n) = Sum_{k=1..n} floor(k*gamma) where gamma is Euler&apos;s constant (A001620).
 * @author Georg Fischer
 */
public class A184977 extends PartialSumSequence {

  /** Construct the sequence. */
  public A184977() {
    super(new A038128());
    super.next();
  }
}
