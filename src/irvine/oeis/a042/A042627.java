package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042627 Denominators of continued fraction convergents to <code>sqrt(843)</code>.
 * @author Sean A. Irvine
 */
public class A042627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042627() {
    super(new long[] {-1, 0, 1684, 0}, new long[] {1, 29, 1683, 48836});
  }
}
