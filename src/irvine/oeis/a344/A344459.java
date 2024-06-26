package irvine.oeis.a344;
// Generated by gen_seq4.pl 2024-07-01/lambdan at 2024-07-01 18:26

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A344459 a(n) = Sum_{d|n} d^Omega(d).
 * @author Georg Fischer
 */
public class A344459 extends LambdaSequence {

  /** Construct the sequence. */
  public A344459() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Z.valueOf(d).pow(Functions.BIG_OMEGA.z(d))));
  }
}
