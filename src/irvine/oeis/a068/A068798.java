package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a067.A067030;
import irvine.oeis.a067.A067034;
import irvine.oeis.a067.A067286;

/**
 * A068798 Integers n such that n = A067030(j) for some j and A067286(j) &lt; A067034(j).
 * @author Sean A. Irvine
 */
public class A068798 extends Sequence1 {

  private final Sequence mA = new A067030();
  private final Sequence mB = new A067286();
  private final Sequence mC = new A067034();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.next();
      if (mB.next().compareTo(mC.next()) < 0) {
        return t;
      }
    }
  }
}
