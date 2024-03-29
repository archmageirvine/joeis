package irvine.oeis.a197;
// Generated by gen_seq4.pl mult at 2022-08-01 11:56

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A197774 Suppose n has prime factorization n = p1^a1 * p2^a2 * ... * pk^ak. Then a(n) = (-1)^(n1 + n2 + ... + nk) if all the ai are ni^2 and a(n) = 0 otherwise.
 * @author Georg Fischer
 */
public class A197774 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A197774() {
    super(1, (p, e) -> Z.valueOf(e).isSquare() ? (Z.valueOf(e).sqrt().isEven() ? Z.ONE : Z.NEG_ONE) : Z.ZERO);
  }
}
