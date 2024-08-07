package irvine.oeis.a369;
// Generated by gen_seq4.pl 2024-07-16/filnum at 2024-07-16 22:37

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A369003 Numbers k for which k' / gcd(k,k') is odd, where k' stands for the arithmetic derivative of k, A003415.
 * @author Georg Fischer
 */
public class A369003 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A369003() {
    super(1, 1, k -> {
      final Z ardk = Functions.ARD.z(k);
      return ardk.divide(Functions.GCD.z(k, ardk)).testBit(0);
    });
  }
}
