package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135556 Squares of numbers not divisible by 3: <code>a(n) =</code> A001651(n)^2.
 * @author Sean A. Irvine
 */
public class A135556 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135556() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 4, 16, 25, 49});
  }
}
