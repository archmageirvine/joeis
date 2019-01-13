package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011534.
 * @author Sean A. Irvine
 */
public class A011534 implements Sequence {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      while (m != 0) {
        if (m % 10 == 4) {
          return Z.valueOf(mN);
        }
        m /= 10;
      }
    }
  }
}
