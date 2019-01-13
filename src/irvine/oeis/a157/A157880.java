package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157880.
 * @author Sean A. Irvine
 */
public class A157880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157880() {
    super(new long[] {1, -1155, 1155}, new long[] {0, 136, 157080});
  }
}
