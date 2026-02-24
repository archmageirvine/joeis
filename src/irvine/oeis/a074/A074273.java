package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000002;

/**
 * A074273 Positions in the Kolakoski sequence (A000002) where there are an even number of 1's and the current term is 1.
 * @author Sean A. Irvine
 */
public class A074273 extends A000002 {

  private long mN = 0;
  private long mOnes = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isOne() && (++mOnes & 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
