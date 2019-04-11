package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131757 Period 10: repeat <code>3, 3, 3, -7, 3, 3, -7, 3, 3, -7</code>.
 * @author Sean A. Irvine
 */
public class A131757 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131757() {
    super(new long[] {-1, -1, -1, -1, -1, -1, -1, -1, -1}, new long[] {3, 3, 3, -7, 3, 3, -7, 3, 3});
  }
}
