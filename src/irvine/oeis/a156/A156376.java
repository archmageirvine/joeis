package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156376 a(n) = 30*n + 19.
 * @author Sean A. Irvine
 */
public class A156376 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156376() {
    super(new long[] {-1, 2}, new long[] {19, 49});
  }
}
