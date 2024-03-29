package irvine.oeis.a367;
// Generated by gen_seq4.pl 2024-01-23/lambdan at 2024-01-25 00:21

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A367507 a(n) = Sum_{d|n} (d+2)^n.
 * @author Georg Fischer
 */
public class A367507 extends LambdaSequence {

  /** Construct the sequence. */
  public A367507() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Z.valueOf(d + 2).pow(n)));
  }
}
