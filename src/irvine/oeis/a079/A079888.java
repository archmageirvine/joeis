package irvine.oeis.a079;

import irvine.oeis.a078.A078756;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A079888 Continued fraction expansion of -x, where x is the unique nonzero real solution to Sum_{p prime} x^p = 0.
 * @author Sean A. Irvine
 */
public class A079888 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A079888() {
    super(0, new A078756());
  }
}
