package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277989 <code>a(n) = 424*2^n + 37</code>.
 * @author Sean A. Irvine
 */
public class A277989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277989() {
    super(new long[] {-2, 3}, new long[] {461, 885});
  }
}
