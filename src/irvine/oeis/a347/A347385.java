package irvine.oeis.a347;
// Generated by gen_seq4.pl mult at 2022-07-21 21:19

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A347385 Dedekind psi function applied to the odd part of n: a(n) = A001615(A000265(n)).
 * @author Georg Fischer
 */
public class A347385 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A347385() {
    super(1, (p, e) -> p.equals(Z.TWO) ? Z.ONE : p.add(1).multiply(p.pow(e - 1)));
  }
}
