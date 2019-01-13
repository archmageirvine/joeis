package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134007.
 * @author Sean A. Irvine
 */
public class A134007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134007() {
    super(new long[] {945, -1689, 950, -230, 25}, new long[] {5, 25, 165, 1225, 9669});
  }
}
