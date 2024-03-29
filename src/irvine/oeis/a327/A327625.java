package irvine.oeis.a327;
// Generated by gen_seq4.pl multman/mult at 2023-10-02 19:24

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A327625 Expansion of Sum_{k&gt;=0} x^(3^k) / (1 - x^(3^k))^2.
 * Multiplicative with: a(3^e) = (3^(e+1)-1)/2, and a(p^e) = p^e for p != 3.
 * @author Georg Fischer
 */
public class A327625 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A327625() {
    super(1, (p, e) -> is3(p) ? Z.THREE.pow(e + 1).subtract(1).divide2() : p.pow(e));
  }
}
