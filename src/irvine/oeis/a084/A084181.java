package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084181 2^n+(-2)^n-(-1)^n.
 * @author Sean A. Irvine
 */
public class A084181 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084181() {
    super(new long[] {4, 4, -1}, new long[] {1, 1, 7});
  }
}
