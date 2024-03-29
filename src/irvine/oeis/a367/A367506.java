package irvine.oeis.a367;
// Generated by gen_seq4.pl 2024-01-23/lambdan at 2024-01-25 00:21

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A367506 a(n) = Sum_{d|n} (d+n)^n.
 * @author Georg Fischer
 */
public class A367506 extends LambdaSequence {

  /** Construct the sequence. */
  public A367506() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Z.valueOf(d + n).pow(n)));
  }
}
