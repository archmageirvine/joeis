package irvine.oeis.a029;

import irvine.oeis.DistinctSequence;

/**
 * A029608 Distinct odd numbers in <code>(2,3)-Pascal</code> triangle <code>A029600</code>.
 * @author Sean A. Irvine
 */
public class A029608 extends DistinctSequence {

  /** Construct the sequence. */
  public A029608() {
    super(new A029604());
  }
}
