package irvine.oeis.a029;

import irvine.oeis.DistinctSequence;

/**
 * A029654 Distinct numbers in the <code>(2,1)-Pascal</code> triangle <code>A029653</code>.
 * @author Sean A. Irvine
 */
public class A029654 extends DistinctSequence {

  /** Construct the sequence. */
  public A029654() {
    super(new A029653());
  }
}
