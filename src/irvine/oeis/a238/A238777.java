package irvine.oeis.a238;
// manually floor at 2021-08-25

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A238777 a(n) = floor((5^n+1)/(2*3^n)).
 * @author Georg Fischer
 */
public class A238777 extends FloorSequence {

  /** Construct the sequence */
  public A238777() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.valueOf(Z.FIVE.pow(n).add(Z.ONE).divide2()).divide(CR.valueOf(Z.THREE.pow(n))).floor();
  }

}
