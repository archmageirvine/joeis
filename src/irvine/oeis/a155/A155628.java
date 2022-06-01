package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155628 a(n) = 7^n-4^n+1^n.
 * @author Sean A. Irvine
 */
public class A155628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155628() {
    super(new long[] {28, -39, 12}, new long[] {1, 4, 34});
  }
}
