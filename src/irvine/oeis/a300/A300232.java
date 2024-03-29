package irvine.oeis.a300;
// Generated by gen_seq4.pl rgs/rgs1 at 2023-10-27 22:09

import irvine.oeis.a286.A286152;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A300232 Restricted growth sequence transform of A286152, filter combining A051953(n) and A046523(n), cototient and the prime signature of n.
 * @author Georg Fischer
 */
public class A300232 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A300232() {
    super(1, new A286152());
  }
}
