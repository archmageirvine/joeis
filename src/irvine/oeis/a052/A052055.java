package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000796;
import irvine.oeis.a001.A001113;

/**
 * A052055 Positions in both Pi and e indicate a common digit.
 * @author Sean A. Irvine
 */
public class A052055 extends A000796 {

  private final Sequence mE = new A001113();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().equals(mE.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

