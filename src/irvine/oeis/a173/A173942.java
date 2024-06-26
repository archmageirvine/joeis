package irvine.oeis.a173;
// Generated by gen_seq4.pl 2024-05-20/filnum at 2024-05-20 22:40

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A173942 Numbers n such that sigma(lambda(n)) = lambda(sigma(n)).
 * @author Georg Fischer
 */
public class A173942 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A173942() {
    super(1, 1, k -> Functions.SIGMA1.z(Functions.CARMICHAEL_LAMBDA.z(k)).equals(Functions.CARMICHAEL_LAMBDA.z(Functions.SIGMA1.z(k))));
  }
}
