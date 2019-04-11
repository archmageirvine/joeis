package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041628 Numerators of continued fraction convergents to <code>sqrt(333)</code>.
 * @author Sean A. Irvine
 */
public class A041628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041628() {
    super(new long[] {-1, 0, 146, 0}, new long[] {18, 73, 2646, 10657});
  }
}
