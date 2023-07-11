package irvine.oeis.a028;

import irvine.oeis.DistinctSequence;

/**
 * A028269 Distinct even elements in 3-Pascal triangle A028262 (by row).
 * @author Sean A. Irvine
 */
public class A028269 extends DistinctSequence {

  /** Construct the sequence. */
  public A028269() {
    super(1, new A028266());
  }
}
