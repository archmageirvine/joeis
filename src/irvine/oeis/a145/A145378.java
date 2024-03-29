package irvine.oeis.a145;
// Generated by gen_seq4.pl multm/mult at 2023-03-26 00:28

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A145378 a(n) = Sum_{d|n} sigma(d) - 2*Sum_{2c|n} sigma(c) + 4*Sum_{4b|n} sigma(b).
 * @author Georg Fischer
 */
public class A145378 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A145378() {
    super(1, (p, e) -> is2(p) ? Z.ONE.shiftLeft(e + 2).subtract(Z.THREE.multiply(e + 1)) : p.multiply(p.pow(e + 1).add(-1)).subtract(p.add(-1).multiply(e + 1)).divide(p.add(-1).square()));
  }
}
