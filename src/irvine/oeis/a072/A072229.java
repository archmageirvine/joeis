package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072229 Witt index of the standard bilinear form &lt;1,1,1,...,1&gt; over the 2-adic rationals.
 * @author Sean A. Irvine
 */
public class A072229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072229() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 0, 0, 0, 1, 2, 3, 4});
  }
}
