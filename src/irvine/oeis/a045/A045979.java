package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a002.A002445;

/**
 * A045979 Numbers m such that the Bernoulli number B_{2m} has denominator 6.
 * @author Sean A. Irvine
 */
public class A045979 extends A002445 {

  /** Construct the sequence. */
  public A045979() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.SIX.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
