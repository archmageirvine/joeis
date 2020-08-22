package irvine.oeis.a029;

import irvine.oeis.DistinctSequence;

/**
 * A029601 Distinct numbers in the (2,3)-Pascal triangle A029600.
 * @author Sean A. Irvine
 */
public class A029601 extends DistinctSequence {

  /** Construct the sequence. */
  public A029601() {
    super(new A029600());
  }
}
