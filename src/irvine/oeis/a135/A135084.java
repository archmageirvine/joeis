package irvine.oeis.a135;
// Generated by gen_seq4.pl 2024-06-23/lambdan at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A135084 a(n) = A000110(2^n-1).
 * @author Georg Fischer
 */
public class A135084 extends LambdaSequence {

  /** Construct the sequence. */
  public A135084() {
    super(1, n -> Functions.BELL.z(Z.TWO.pow(n).subtract(1)));
  }
}
