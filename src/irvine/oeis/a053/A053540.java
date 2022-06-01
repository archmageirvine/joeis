package irvine.oeis.a053;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A053540 a(n) = n*9^(n-1).
 * @author Sean A. Irvine
 */
public class A053540 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053540() {
    super(new long[] {-81, 18}, new long[] {1, 18});
  }
}
