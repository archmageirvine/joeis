package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145654.
 * @author Sean A. Irvine
 */
public class A145654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145654() {
    super(new long[] {2, -5, 4}, new long[] {0, 2, 8});
  }
}
