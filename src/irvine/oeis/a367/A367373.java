package irvine.oeis.a367;
// Generated by gen_seq4.pl 2024-03-06/lambdan at 2024-03-06 21:44

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A367373 Expansion of the e.g.f. (exp(x) / (4 - 3*exp(x)))^(3/4).
 * @author Georg Fischer
 */
public class A367373 extends LambdaSequence {

  /** Construct the sequence. */
  public A367373() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Z.NEG_ONE.pow(n - k).multiply(Integers.SINGLETON.product(0, k - 1, j -> Z.valueOf(4L * j + 3))).multiply(Functions.STIRLING2.z(n, k))));
  }
}
