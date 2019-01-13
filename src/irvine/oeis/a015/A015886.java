package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015886.
 * @author Sean A. Irvine
 */
public class A015886 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      ++k;
      if (Cheetah.factor(mN + k).sigma().equals(Cheetah.factor(k).sigma().add(mN))) {
        return Z.valueOf(k);
      }
    }
  }
}

