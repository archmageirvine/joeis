package irvine.oeis.a067;

import irvine.oeis.a065.A065444;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A067617 Continued fraction for 9 * sum( 1/(10^k -1), k=1..0/0 ).
 * @author Sean A. Irvine
 */
public class A067617 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A067617() {
    super(new A065444());
  }
}
