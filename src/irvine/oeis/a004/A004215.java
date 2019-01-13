package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004215.
 * @author Sean A. Irvine
 */
public class A004215 implements Sequence {

  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      while ((m & 3) == 0) {
        m >>>= 2;
      }
      if ((m & 7) == 7) {
        return Z.valueOf(mN);
      }
    }
  }
}
