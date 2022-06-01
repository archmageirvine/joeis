package irvine.oeis.a053;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A053430 a(n) = (6^(n+1) - (-5)^(n+1))/11.
 * @author Sean A. Irvine
 */
public class A053430 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053430() {
    super(new long[] {30, 1}, new long[] {1, 1});
  }
}
