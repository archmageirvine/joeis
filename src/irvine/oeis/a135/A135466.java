package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135466.
 * @author Sean A. Irvine
 */
public class A135466 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135466() {
    super(new long[] {8, -12, 6}, new long[] {8, 9, 8});
  }
}
