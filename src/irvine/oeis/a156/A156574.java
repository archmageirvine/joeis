package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156574.
 * @author Sean A. Irvine
 */
public class A156574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156574() {
    super(new long[] {1, -35, 35}, new long[] {1369, 42025, 1423249});
  }
}
