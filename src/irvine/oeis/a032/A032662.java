package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032662 Smallest n concatenated with n + d (d = 0,1,2,3,...) is a prime.
 * @author Sean A. Irvine
 */
public class A032662 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long l = 0;
    while (true) {
      if (new Z(String.valueOf(++l) + (mN + l)).isProbablePrime()) {
        return Z.valueOf(l);
      }
    }
  }
}
