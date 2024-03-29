package irvine.oeis.a286;
// Generated by gen_seq4.pl mult at 2022-07-21 21:19

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A286324 a(n) is the number of bi-unitary divisors of n.
 * @author Georg Fischer
 */
public class A286324 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A286324() {
    super(1, (p, e) -> Z.valueOf(e + (e % 2)));
  }
}
