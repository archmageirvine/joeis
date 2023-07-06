package irvine.oeis.a136;
// manually (binomx) at 2021-06-28 

import irvine.oeis.a110.A110041;
import irvine.oeis.transform.BinomialTransformSequence;

/**
 * A136282 Number of graphs on n labeled nodes with degree at most 3.
 * @author Georg Fischer
 */
public class A136282 extends BinomialTransformSequence {

  /** Construct the sequence. */
  public A136282() {
    super(new A110041(), 0);
    skip();
  }
}
