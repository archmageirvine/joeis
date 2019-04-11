package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123290 Number of distinct binomial(n,2)-tuples of zeros and ones that are obtained as the collection of all 2 X 2 minor determinants of <code>a 2</code> X n matrix over GF(2).
 * @author Sean A. Irvine
 */
public class A123290 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123290() {
    super(new long[] {8, -14, 7}, new long[] {2, 8, 36});
  }
}
