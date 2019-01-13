package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178946.
 * @author Sean A. Irvine
 */
public class A178946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178946() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 3, 11, 22, 45, 73});
  }
}
