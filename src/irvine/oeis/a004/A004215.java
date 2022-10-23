package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004215 Numbers that are the sum of 4 but no fewer nonzero squares.
 * @author Sean A. Irvine
 */
public class A004215 extends Sequence1 {

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
