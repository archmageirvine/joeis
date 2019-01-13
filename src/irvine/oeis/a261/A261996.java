package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261996.
 * @author Sean A. Irvine
 */
public class A261996 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261996() {
    super(new long[] {1, -1, 0, 0, -110, 110, 0, 0, 1}, new long[] {8, 44, 128, 788, 2024, 5948, 15176, 87764, 223712});
  }
}
