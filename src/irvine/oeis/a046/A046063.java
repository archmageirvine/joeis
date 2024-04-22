package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046063 Numbers k such that the k-th partition number A000041(k) is prime.
 * @author Sean A. Irvine
 */
public class A046063 extends Sequence1 {

  private int mN = 1;

  @Override
  public Z next() {
    while (true) {
      final int index = ++mN;
      if (Functions.PARTITIONS.z(index).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
