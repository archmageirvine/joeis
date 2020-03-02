package irvine.oeis.a029;

import irvine.oeis.DistinctSequence;

/**
 * A029601 Distinct numbers in the <code>(2,3)-Pascal</code> triangle <code>A029600</code>.
 * @author Sean A. Irvine
 */
public class A029601 extends DistinctSequence {

  /** Construct the sequence. */
  public A029601() {
    super(new A029600());
  }
}
