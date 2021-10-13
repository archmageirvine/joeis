package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156855 a(n) = 2025*n^2 - n.
 * @author Sean A. Irvine
 */
public class A156855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156855() {
    super(new long[] {1, -3, 3}, new long[] {2024, 8098, 18222});
  }
}
