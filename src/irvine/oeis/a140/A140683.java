package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140683.
 * @author Sean A. Irvine
 */
public class A140683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140683() {
    super(new long[] {2, -1}, new long[] {-4, 5});
  }
}
