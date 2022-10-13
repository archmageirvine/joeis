package irvine.oeis.a059;

import irvine.math.z.BellNumbers;
import irvine.math.z.Integers;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059849 Number of pairs of partitions of {1,2,...,n} whose meet is the partition {{1}, {2}, ..., {n}}.
 * @author Sean A. Irvine
 */
public class A059849 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> Stirling.firstKind(mN, k).multiply(BellNumbers.bell(k).square()));
  }
}

