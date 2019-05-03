package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063267 Eighth column <code>(k=7)</code> of septinomial array <code>A063265</code>.
 * @author Sean A. Irvine
 */
public class A063267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063267() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {6, 33, 116, 325, 786, 1709, 3424, 6426});
  }
}
