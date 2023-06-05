package irvine.oeis.a357;
// manually dirichcon/dirichcon2 at 2023-06-04 21:23

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A357938 Inverse Moebius transform of n * 2^omega(n).
 * @author Georg Fischer
 */
public class A357938 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A357938() {
    // Multiplicative with a(p^e) = 2 * (p^(e+1)-1) / (p-1) - 1 
    super(1, (p, e) -> Z.TWO.multiply(p.pow(e + 1).subtract(1)).divide(p.subtract(1)).subtract(1));
  }
}
