package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261973.
 * @author Sean A. Irvine
 */
public class A261973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261973() {
    super(new long[] {1, -47, 47}, new long[] {137, 6341, 291593});
  }
}
