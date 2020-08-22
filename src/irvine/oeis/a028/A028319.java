package irvine.oeis.a028;

import irvine.oeis.DistinctSequence;

/**
 * A028319 Distinct odd elements in the 5-Pascal triangle A028313.
 * @author Sean A. Irvine
 */
public class A028319 extends DistinctSequence {

  /** Construct the sequence. */
  public A028319() {
    super(new A028315());
  }
}
