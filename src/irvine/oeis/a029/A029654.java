package irvine.oeis.a029;

import irvine.oeis.DistinctSequence;

/**
 * A029654 Distinct numbers in the (2,1)-Pascal triangle A029653.
 * @author Sean A. Irvine
 */
public class A029654 extends DistinctSequence {

  /** Construct the sequence. */
  public A029654() {
    super(1, new A029653());
  }
}
