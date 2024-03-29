package irvine.oeis.a133;
// Generated by gen_seq4.pl mult at 2022-08-01 11:56

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A133639 Mobius transform of b(n) where b(8n + 1) = A080995(n).
 * @author Georg Fischer
 */
public class A133639 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A133639() {
    super(1, (p, e) -> p.compareTo(Z.THREE) <= 0 ? Z.valueOf(e == 1 ? -1 : 0) : Z.valueOf(neg1(e)));
  }
}
