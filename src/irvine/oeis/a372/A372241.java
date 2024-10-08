package irvine.oeis.a372;
// Generated by gen_seq4.pl 2024-09-12.ack/lambdan at 2024-09-12 20:55

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A372241 a(n) = Product_{j=1..n} j^(ceiling(sqrt(j))).
 * @author Georg Fischer
 */
public class A372241 extends LambdaSequence {

  /** Construct the sequence. */
  public A372241() {
    super(0, n -> Integers.SINGLETON.product(1, n, j -> Z.valueOf(j).pow(Functions.CEIL_SQRT.i(j))));
  }
}
