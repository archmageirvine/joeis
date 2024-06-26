package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059849 Number of pairs of partitions of {1,2,...,n} whose meet is the partition {{1}, {2}, ..., {n}}.
 * @author Sean A. Irvine
 */
public class A059849 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> Functions.STIRLING1.z(mN, k).multiply(Functions.BELL.z(k).square()));
  }
}

