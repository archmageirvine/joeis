package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123290 Number of distinct <code>binomial(n,2)-tuples</code> of zeros and ones that are obtained as the collection of all <code>2 X 2</code> minor determinants of a <code>2 X n</code> matrix over <code>GF(2)</code>.
 * @author Sean A. Irvine
 */
public class A123290 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123290() {
    super(new long[] {8, -14, 7}, new long[] {2, 8, 36});
  }
}
