package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a036.A036691;

/**
 * A053982 Numbers n such that 1 + product of first n composite numbers is prime.
 * @author Sean A. Irvine
 */
public class A053982 extends A036691 {

  private long mN = 0;
  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
