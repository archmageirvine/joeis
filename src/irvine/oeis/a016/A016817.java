package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016817 a(n) = (4n+1)^5.
 * @author Sean A. Irvine
 */
public class A016817 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016817() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 3125, 59049, 371293, 1419857, 4084101});
  }
}
