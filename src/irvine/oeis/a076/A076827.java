package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a002.A002977;

/**
 * A061913.
 * @author Sean A. Irvine
 */
public class A076827 extends A002977 {

  private long mS = 0;

  @Override
  public Z next() {
    if (super.next().isOdd()) {
      ++mS;
    } else {
      --mS;
    }
    return Z.valueOf(mS);
  }
}
