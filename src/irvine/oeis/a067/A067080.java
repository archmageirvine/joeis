package irvine.oeis.a067;
// Generated by gen_seq4.pl 2024-10-15.ack/lambdan at 2024-10-15 22:29

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A067080 If n = ab...def in decimal notation then the left digitorial function Ld(n) = ab...def*ab...de*ab...d*...*ab*a.
 * @author Georg Fischer
 */
public class A067080 extends LambdaSequence {

  /** Construct the sequence. */
  public A067080() {
    super(1, n -> Integers.SINGLETON.product(0, Functions.DIGIT_LENGTH.i(10, n) - 1, k -> Z.valueOf(n).divide(Z.TEN.pow(k))));
  }
}
