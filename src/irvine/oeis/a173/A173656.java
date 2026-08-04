package irvine.oeis.a173;

import irvine.math.z.Z;
import irvine.oeis.BriefSequence;

/**
 * A173656 Primes p such that p^2 divides P(p), where P = Perrin sequence A001608.
 * @author Georg Fischer
 */
public class A173656 extends BriefSequence {

  /** Construct the sequence. */
  public A173656() {
    super(1, BRIEF, new Z("521"), new Z("190699"), new Z("36944128783"));
  }
}
