package irvine.oeis.a054;

import irvine.oeis.a035.A035512;
import irvine.oeis.transform.WeighTransformSequence;

/**
 * A054952 Number of unlabeled semi-strong digraphs on n nodes with pairwise different components.
 * @author Sean A. Irvine
 */
public class A054952 extends WeighTransformSequence {

  /** Construct the sequence. */
  public A054952() {
    super(new A035512());
    next();
  }
}
