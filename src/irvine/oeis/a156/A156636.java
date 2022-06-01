package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156636 a(n) = 4394*n + 1820.
 * @author Sean A. Irvine
 */
public class A156636 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156636() {
    super(new long[] {-1, 2}, new long[] {1820, 6214});
  }
}
