package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a046.A046523;

/**
 * A071291.
 * @author Sean A. Irvine
 */
public class A071366 extends Sequence1 {

  private final Sequence mA071364 = new A071364();
  private final Sequence mA046523 = new A046523();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z a = mA071364.next();
      if (!a.equals(mA046523.next()) && !a.equals(Z.valueOf(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
