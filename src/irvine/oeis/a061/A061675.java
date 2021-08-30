package irvine.oeis.a061;
// manually floor at 2021-08-30 14:32

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A061675 a(n) = floor(Pi^n + e^n).
 * @author Georg Fischer
 */
public class A061675 extends FloorSequence {

  /** Construct the sequence */
  public A061675() {
    super(0);
  }

  protected Z evalCR(final long n) {
    return CR.PI.pow(n).add(CR.E.pow(n)).floor();
  }

}
