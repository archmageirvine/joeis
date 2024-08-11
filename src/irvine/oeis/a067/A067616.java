package irvine.oeis.a067;

import irvine.oeis.a065.A065443;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A067616 Continued fraction for sum(k&gt;=1, (2^k-1)^(-2) ).
 * @author Sean A. Irvine
 */
public class A067616 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A067616() {
    super(0, new A065443());
  }
}
