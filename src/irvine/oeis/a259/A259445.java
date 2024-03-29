package irvine.oeis.a259;
// Generated by gen_seq4.pl mult at 2022-08-01 11:56

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A259445 Multiplicative with a(n) = n if n is odd and a(2^s)=2.
 * @author Georg Fischer
 */
public class A259445 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A259445() {
    super(1, (p, e) -> is2(p) ? Z.TWO : p.pow(e));
  }
}
