package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199753 4*11^n+1.
 * @author Sean A. Irvine
 */
public class A199753 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199753() {
    super(new long[] {-11, 12}, new long[] {5, 45});
  }
}
