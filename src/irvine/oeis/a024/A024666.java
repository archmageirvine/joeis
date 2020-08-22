package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a003.A003325;

/**
 * A024666 Positions of odd numbers in A003325.
 * @author Sean A. Irvine
 */
public class A024666 extends A003325 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (!super.next().isEven()) {
        return Z.valueOf(mN);
      }
    }
  }
}
