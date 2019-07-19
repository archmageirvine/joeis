package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A024621.
 * @author Sean A. Irvine
 */
public class A024621 extends A000961 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (!super.next().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
