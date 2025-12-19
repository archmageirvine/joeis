package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a050.A050221;
import irvine.oeis.a060.A060863;

/**
 * A082661 Numbers n such that A082596(n) = A050221(n), sequence gives A060863(n).
 * @author Sean A. Irvine
 */
public class A082661 extends Sequence1 {

  private final Sequence mA = new A082596();
  private final Sequence mB = new A050221();
  private final Sequence mC = new A060863();

  @Override
  public Z next() {
    while (true) {
      final Z a = mA.next();
      final Z b = mB.next();
      final Z c = mC.next();
      if (a.equals(b)) {
        return c;
      }
    }
  }
}
