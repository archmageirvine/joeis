package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156866 a(n) = 729000*n - 116820.
 * @author Sean A. Irvine
 */
public class A156866 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156866() {
    super(1, new long[] {-1, 2}, new long[] {612180, 1341180});
  }
}
