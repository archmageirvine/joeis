package irvine.oeis.a050;

import irvine.oeis.a008.A008836;
import irvine.oeis.transform.ExponentialRevertTransformSequence;

/**
 * A050388 Exponential reversion of Liouville's lambda function A008836.
 * @author Sean A. Irvine
 */
public class A050388 extends ExponentialRevertTransformSequence {

  /** Construct the sequence. */
  public A050388() {
    super(new A008836());
  }
}
