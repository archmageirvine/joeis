package irvine.oeis.a078;
// Generated by gen_seq4.pl multman/mult at 2023-10-02 19:24

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A078461 a(n) = 0 if n is divisible by the square of odd prime, a(n) = 1 if n is an odd squarefree number, a(n) = 2 otherwise.
 * Multiplicative with: a(2^e) = 2, and for an odd prime p a(p^e) = 1 if e = 1 and 0 otherwise.
 * @author Georg Fischer
 */
public class A078461 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A078461() {
    super(1, (p, e) -> is2(p) ? Z.TWO : Z.valueOf((e == 1) ? 1 : 0));
  }
}
