package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041841 Denominators of continued fraction convergents to <code>sqrt(442)</code>.
 * @author Sean A. Irvine
 */
public class A041841 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041841() {
    super(new long[] {1, 42}, new long[] {1, 42});
  }
}
