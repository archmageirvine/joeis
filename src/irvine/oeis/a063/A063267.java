package irvine.oeis.a063;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A063267 Eighth column (k=7) of septinomial array A063265.
 * @author Sean A. Irvine
 */
public class A063267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063267() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {6, 33, 116, 325, 786, 1709, 3424, 6426});
  }
}
