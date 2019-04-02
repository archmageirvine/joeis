package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093033 Number of interior balls in a truncated octahedral arrangement.
 * @author Sean A. Irvine
 */
public class A093033 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093033() {
    super(new long[] {-1, 4, -6, 4}, new long[] {6, 79, 314, 807});
  }
}
