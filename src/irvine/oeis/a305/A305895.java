package irvine.oeis.a305;
// Generated by gen_seq4.pl rgs/rgs2 at 2023-10-24 18:46

import irvine.oeis.a001.A001065;
import irvine.oeis.a051.A051953;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A305895 Filter sequence combining sum of proper divisors (A001065) and cototient (A051953) of n.
 * @author Georg Fischer
 */
public class A305895 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A305895() {
    super(1, new A001065(), new A051953());
  }
}
