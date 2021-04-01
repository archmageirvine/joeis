package irvine.oeis.a046;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046063 Numbers n such that n-th partition number A000041(n) is prime.
 * @author Sean A. Irvine
 */
public class A046063 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (IntegerPartition.partitions(++mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
