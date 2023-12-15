package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001405;

/**
 * A067366 Numbers n such that 1+C(n,floor(n/2)) is prime, where C(n,floor(n/2)) = A001405(n) is a central binomial coefficient.
 * @author Sean A. Irvine
 */
public class A067366 extends Sequence1 {

  private long mN = -1;
  private final Sequence mF = new A001405();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mF.next().add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
