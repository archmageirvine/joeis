package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109718 Periodic sequence with period <code>{0,1,0,3}</code>, or <code>n^3 mod 4</code>.
 * @author Sean A. Irvine
 */
public class A109718 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109718() {
    super(new long[] {1, 0, 0, 0}, new long[] {0, 1, 0, 3});
  }
}
