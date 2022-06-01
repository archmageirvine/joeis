package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165748 a(n) = (8/9)*(2+7*(-8)^(n-1)).
 * @author Sean A. Irvine
 */
public class A165748 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165748() {
    super(new long[] {8, -7}, new long[] {1, 8});
  }
}
