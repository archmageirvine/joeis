package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108946.
 * @author Sean A. Irvine
 */
public class A108946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108946() {
    super(new long[] {1, 4, 0, -4}, new long[] {1, -3, 13, -48});
  }
}
