package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028041.
 * @author Sean A. Irvine
 */
public class A028041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028041() {
    super(new long[] {-924, 755, -215, 25}, new long[] {1, 25, 410, 5630});
  }
}
