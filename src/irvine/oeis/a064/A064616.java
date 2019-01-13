package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064616.
 * @author Sean A. Irvine
 */
public class A064616 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064616() {
    super(new long[] {100, -120, 21}, new long[] {9, 89, 789});
  }
}
