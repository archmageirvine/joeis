package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006090.
 * @author Sean A. Irvine
 */
public class A006090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006090() {
    super(new long[] {-6, -15, -20, -15, -6}, new long[] {1, -6, 21, -56, 126});
  }
}

