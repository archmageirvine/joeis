package irvine.oeis.a029;

import irvine.oeis.DistinctSequence;

/**
 * A029626 Distinct odd numbers in (3,2)-Pascal triangle A029618.
 * @author Sean A. Irvine
 */
public class A029626 extends DistinctSequence {

  /** Construct the sequence. */
  public A029626() {
    super(new A029622());
  }
}
