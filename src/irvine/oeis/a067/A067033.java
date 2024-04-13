package irvine.oeis.a067;

import java.util.TreeMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067033 Smallest k such that A067030(n) = k + reverse(k).
 * @author Sean A. Irvine
 */
public class A067033 extends Sequence0 {

  private final TreeMap<Long, Long> mValues = new TreeMap<>();
  private long mN = -1;

  @Override
  public Z next() {
    while (mValues.isEmpty() || mN < mValues.firstKey()) {
      ++mN;
      mValues.putIfAbsent(mN + Functions.REVERSE.l(mN), mN);
    }
    return Z.valueOf(mValues.pollFirstEntry().getValue());
  }
}

