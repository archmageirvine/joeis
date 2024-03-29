package irvine.oeis.a151;
// Generated by gen_seq4.pl 2023-10-12/lambdan at 2023-10-12 23:13

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A151780 a(n) = 5^(wt(n) - 1) where wt(n) = A000120(n).
 * @author Georg Fischer
 */
public class A151780 extends LambdaSequence {

  /** Construct the sequence. */
  public A151780() {
    super(1, n -> Z.FIVE.pow(Integer.bitCount(n) - 1));
  }
}
