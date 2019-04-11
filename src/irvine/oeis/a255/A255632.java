package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255632 Number of n-length words on <code>{0,1,2,3,4}</code> avoiding runs of zeros of length <code>1 (mod 3)</code>.
 * @author Sean A. Irvine
 */
public class A255632 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255632() {
    super(new long[] {5, 0, 4}, new long[] {1, 4, 17});
  }
}
