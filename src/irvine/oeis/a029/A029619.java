package irvine.oeis.a029;

import irvine.oeis.DistinctSequence;

/**
 * A029619 Distinct numbers in <code>(3,2)-Pascal</code> triangle <code>A029618</code>.
 * @author Sean A. Irvine
 */
public class A029619 extends DistinctSequence {

  /** Construct the sequence. */
  public A029619() {
    super(new A029618());
  }
}
