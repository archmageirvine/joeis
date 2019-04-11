package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041365 Denominators of continued fraction convergents to <code>sqrt(197)</code>.
 * @author Sean A. Irvine
 */
public class A041365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041365() {
    super(new long[] {1, 28}, new long[] {1, 28});
  }
}
