package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003757.
 * @author Sean A. Irvine
 */
public class A003757 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003757() {
    super(new long[]{-1, 1, 6, 1}, new long[]{0, 1, 1, 6});
  }
}
