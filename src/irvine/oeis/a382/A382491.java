package irvine.oeis.a382;
// Generated by gen_seq4.pl 2025-04-15.ack/lambdan at 2025-04-15 19:24

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A382491 a(n) is the numerator of the asymptotic density of the numbers whose number of 3-smooth divisors is n.
 * @author Georg Fischer
 */
public class A382491 extends LambdaSequence {

  /** Construct the sequence. */
  public A382491() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Z.TWO.pow(n - d).multiply(Z.THREE.pow(n - n / d))));
  }
}
