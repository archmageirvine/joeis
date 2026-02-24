package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000002;

/**
 * A074278 Positions in the Kolakoski sequence A000002 when there are a multiple of 3 1's and the current term is 1.
 * @author Sean A. Irvine
 */
public class A074278 extends A000002 {

  private long mN = 0;
  private long mOnes = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isOne() && (++mOnes % 3) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
