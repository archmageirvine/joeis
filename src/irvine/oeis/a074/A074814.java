package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a035.A035250;

/**
 * A006420.
 * @author Sean A. Irvine
 */
public class A074814 extends Sequence1 {

  private final Sequence mA = new A035250();
  private final Sequence mB = new A074813();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mA.next().equals(mB.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
