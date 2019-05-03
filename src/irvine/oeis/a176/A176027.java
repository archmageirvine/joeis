package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176027 Binomial transform of <code>A005563</code>.
 * @author Sean A. Irvine
 */
public class A176027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176027() {
    super(new long[] {8, -12, 6}, new long[] {0, 3, 14});
  }
}
