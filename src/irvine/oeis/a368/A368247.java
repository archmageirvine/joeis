package irvine.oeis.a368;
// Generated by gen_seq4.pl 2024-05-08/mulr at 2024-05-08 21:31

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A368247 The number of cubefree divisors of the cubefull part of n (A360540).
 * Multiplicative with: Multiplicativewitha(p^e)=(\d+)ife<=(\d+), and(\d+)otherwise
 * @author Georg Fischer
 */
public class A368247 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A368247() {
    super(1, (p, e) -> e <= 2 ? Z.ONE : Z.THREE);
  }
}
