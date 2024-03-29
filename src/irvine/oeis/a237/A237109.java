package irvine.oeis.a237;
// Generated by gen_seq4.pl multman/mult at 2023-10-02 19:24

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A237109 a(n) is the numerator of 2*n / ((n+2) * (n+3)).
 * Multiplicative with: a(2) = 1, a(2^e) = 2^e for e > 1, a(3^e) = 3^(e-1), and a(p^e) = p^e for p >= 5.
 * @author Georg Fischer
 */
public class A237109 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A237109() {
    super(1, (p, e) -> is2(p) ? ((e == 1) ? Z.ONE : Z.TWO.pow(e)) : (is3(p) ? Z.THREE.pow(e - 1) : p.pow(e)));
  }
}
