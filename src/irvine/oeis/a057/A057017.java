package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a036.A036691;

/**
 * A057017 Product of first n composite numbers minus 1 is a prime.
 * @author Sean A. Irvine
 */
public class A057017 extends A036691 {

  private long mN = 0;
  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
