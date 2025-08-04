package irvine.oeis.a079;

import irvine.oeis.Combiner;

/**
 * A079169 Difference between A079168(n) and A079167(n).
 * @author Sean A. Irvine
 */
public class A079169 extends Combiner {

  /** Construct the sequence. */
  public A079169() {
    super(1, new A079168(), new A079167(), SUBTRACT);
  }
}
