package irvine.oeis.a326;
// Generated by gen_seq4.pl multman/mult at 2023-10-03 19:56

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A326401 Expansion of Sum_{k&gt;=1} k * x^k / (1 + x^k + x^(2*k)).
 * Multiplicative with: a(3^e) = 3^e, a(p^e) = (p^(e+1) - 1)/(p - 1) if p == 1 (mod 3), and (p^(e+1) + (-1)^e)/(p + 1) if p == 2 (mod 3).
 * @author Georg Fischer
 */
public class A326401 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A326401() {
    super(1, (p, e) -> is3(p) ? Z.THREE.pow(e) : (isMod(3, p, 1) ? sigmaP(p, e) : p.pow(e + 1).add(neg1(e)).divide(p.add(1))));
  }
}
