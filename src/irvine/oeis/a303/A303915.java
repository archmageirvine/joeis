package irvine.oeis.a303;
// manually 2023-03-25 22:32

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A303915 a(n) = lambda(n)*E(n), where lambda(n) = A008836(n) and E(n) = A005361(n).
 * Multiplicative with <code>a(p^e) = e*(-1)^e, p prime and e &gt; 0.</code>
 * @author Georg Fischer
 */
public class A303915 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A303915() {
    super(1, (p, e) -> (((e & 1) == 0) ? Z.ONE : Z.NEG_ONE).multiply(e));
  }
}
