package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A001560 Numbers with an even number of partitions.
 * @author Sean A. Irvine
 */
public class A001560 extends A000041 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isEven()) {
        return Z.valueOf(mN);
      }
    }
  }
}
