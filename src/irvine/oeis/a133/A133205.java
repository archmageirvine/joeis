package irvine.oeis.a133;
// Generated by gen_seq4.pl mult at 2022-07-21 21:19

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A133205 Fully multiplicative with a(p) = p*(p+1)/2 for prime p.
 * @author Georg Fischer
 */
public class A133205 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A133205() {
    super(1, (p, e) -> p.multiply(p.add(Z.ONE)).divide2().pow(e));
  }
}
