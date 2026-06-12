package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000108;

/**
 * A085297 Nonzero residues of Catalan sequence modulo 3; related to the Thue-Morse sequence (A001285).
 * @author Sean A. Irvine
 */
public class A085297 extends Sequence1 {

  private final Sequence mS = new A000108();

  @Override
  public Z next() {
    while (true) {
      final Z t = mS.next().mod(Z.THREE);
      if (!t.isZero()) {
        return t;
      }
    }
  }
}
