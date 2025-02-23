package irvine.oeis.a377;
// Generated by gen_seq4.pl 2024-11-21.ack/lambdan at 2024-11-21 23:03

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A377642 a(n) = (1/(n-1)!) * Product_{i=1..n-1} (2^n-2^i).
 * @author Georg Fischer
 */
public class A377642 extends LambdaSequence {

  /** Construct the sequence. */
  public A377642() {
    super(1, n -> Integers.SINGLETON.product(1, n - 1, i -> Z.TWO.pow(n).subtract(Z.TWO.pow(i))).divide(Functions.FACTORIAL.z(n - 1)));
  }
}
