package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027006 a(n) = T(2*n+1, n+3), T given by A026998.
 * @author Sean A. Irvine
 */
public class A027006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027006() {
    super(new long[] {1, -8, 26, -45, 45, -26, 8}, new long[] {1, 34, 281, 1397, 5353, 17643, 53062});
  }
}
