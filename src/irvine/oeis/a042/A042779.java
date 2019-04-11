package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042779 Denominators of continued fraction convergents to <code>sqrt(920)</code>.
 * @author Sean A. Irvine
 */
public class A042779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042779() {
    super(new long[] {-1, 0, 182, 0}, new long[] {1, 3, 181, 546});
  }
}
