package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a053.A053664;
import irvine.oeis.a073.A073605;

/**
 * A392622.
 * @author Sean A. Irvine
 */
public class A083400 extends Sequence1 {

  private final Sequence mA = new A053664();
  private final Sequence mB = new A073605();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z r = mA.next();
      final Z s = mB.next();
      if (r.isProbablePrime() && s.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
