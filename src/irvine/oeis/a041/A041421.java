package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041421 Denominators of continued fraction convergents to <code>sqrt(226)</code>.
 * @author Sean A. Irvine
 */
public class A041421 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041421() {
    super(new long[] {1, 30}, new long[] {1, 30});
  }
}
