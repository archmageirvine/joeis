package irvine.oeis.a029;

import irvine.oeis.DistinctSequence;

/**
 * A029608 Distinct odd numbers in (2,3)-Pascal triangle A029600.
 * @author Sean A. Irvine
 */
public class A029608 extends DistinctSequence {

  /** Construct the sequence. */
  public A029608() {
    super(new A029604());
  }
}
