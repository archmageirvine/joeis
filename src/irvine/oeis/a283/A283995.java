package irvine.oeis.a283;
// Generated by gen_seq4.pl A069877/parmof3 at 2023-07-26 13:08

import irvine.factor.util.FactorUtils;
import irvine.oeis.a007.A007955;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A283995 Least number with same prime signature as the n-th divisorial: a(n) = A046523(A007955(n)).
 * @author Georg Fischer
 */
public class A283995 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A283995() {
    super(1, new A007955(), FactorUtils::leastPrimeSignature);
  }
}
