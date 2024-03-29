package irvine.oeis.a370;
// Generated by gen_seq4.pl 2024-02-26/lambdan at 2024-02-26 19:18

import irvine.math.zi.Zi;
import irvine.oeis.LambdaSequence;

/**
 * A370359 Imaginary part of (n + n*i)^n where i = sqrt(-1).
 * @author Georg Fischer
 */
public class A370359 extends LambdaSequence {

  /** Construct the sequence. */
  public A370359() {
    super(0, n -> new Zi(n, n).pow(n).im());
  }
}
