package irvine.oeis.a106;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A106707 a(n) = -A001353(n).
 * @author Sean A. Irvine
 */
public class A106707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106707() {
    super(new long[] {-1, 4}, new long[] {0, -1});
  }
}
