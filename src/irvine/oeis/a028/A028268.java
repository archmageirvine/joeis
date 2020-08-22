package irvine.oeis.a028;

import irvine.oeis.DistinctSequence;

/**
 * A028268 Distinct odd elements in 3-Pascal triangle A028262 (by row).
 * @author Sean A. Irvine
 */
public class A028268 extends DistinctSequence {

  /** Construct the sequence. */
  public A028268() {
    super(new A028264());
  }
}
