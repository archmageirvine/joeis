package irvine.oeis.a140;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A140827 Interleave denominators and numerators of convergents to sqrt(3).
 * @author Sean A. Irvine
 */
public class A140827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140827() {
    super(new long[] {-1, 0, 0, 4, 0, 0}, new long[] {1, 1, 2, 3, 4, 7});
  }
}
