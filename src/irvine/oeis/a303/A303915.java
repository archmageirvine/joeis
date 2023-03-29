package irvine.oeis.a303;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A303915 a(n) = lambda(n)*E(n), where lambda(n) = A008836(n) and E(n) = A005361(n).
 * <code>a(p^e) = e*(-1)^e</code>
 * @author Georg Fischer
 */
public class A303915 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A303915() {
    super(1, (p, e) -> (((e & 1) == 0) ? Z.ONE : Z.NEG_ONE).multiply(e));
  }
}
