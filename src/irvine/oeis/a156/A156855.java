package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156855 <code>2025n^2 - n</code>.
 * @author Sean A. Irvine
 */
public class A156855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156855() {
    super(new long[] {1, -3, 3}, new long[] {2024, 8098, 18222});
  }
}
