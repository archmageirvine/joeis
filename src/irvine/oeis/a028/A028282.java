package irvine.oeis.a028;

import irvine.oeis.DistinctSequence;

/**
 * A028282 Distinct even elements in 4-Pascal triangle A028275 (by row).
 * @author Sean A. Irvine
 */
public class A028282 extends DistinctSequence {

  /** Construct the sequence. */
  public A028282() {
    super(new A028279());
  }
}
