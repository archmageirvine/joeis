package irvine.oeis.a351;
// Generated by gen_seq4.pl 2024-02-07/lambdan at 2024-02-07 14:25

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A351758 a(n) = Sum_{p|n, p prime} Sum_{d|n} lcm(d,p).
 * @author Georg Fischer
 */
public class A351758 extends LambdaSequence {

  /** Construct the sequence. */
  public A351758() {
    super(1, n -> Integers.SINGLETON.sopf(n, p -> Integers.SINGLETON.sumdiv(n, d -> Functions.LCM.z(d, p))));
  }
}
