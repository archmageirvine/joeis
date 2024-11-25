package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073335 Total number of prime power parts in all partitions of n.
 * @author Sean A. Irvine
 */
public class A073335 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN, k -> Functions.PARTITIONS.z(mN - k).multiply(Functions.BIG_OMEGA.z(k)));
  }
}

