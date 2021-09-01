package irvine.oeis.a094;
// manually floor at 2021-08-31 12:46

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A094062 a(n) = ceiling((3-sqrt(3))*4^(n-3)) + 1 for n&gt;=2, a(1)=1.
 * @author Georg Fischer
 */
public class A094062 extends FloorSequence {

  /** Construct the sequence. */
  public A094062() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return mN <= 1 ? Z.ONE : CR.THREE.subtract(CR.THREE.sqrt()).multiply(CR.FOUR.pow(CR.valueOf(n).subtract(CR.THREE))).ceil().add(Z.ONE);
  }

}
