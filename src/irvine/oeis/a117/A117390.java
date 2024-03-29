package irvine.oeis.a117;
// Generated by gen_seq4.pl bref at 2020-11-27 17:17

import irvine.math.z.Z;
import irvine.oeis.BriefSequence;

/**
 * A117390 Numbers n such that 1234567890*sum(k=1,n,10^(10k-9)) + 1 is prime.
 *
 * @author Georg Fischer
 */
public class A117390 extends BriefSequence {

  /** Construct the sequence. */
  public A117390() {
    super(1, BRIEF, new Z("17"), new Z("56"), new Z("1888"));
  }
}
