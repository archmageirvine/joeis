package irvine.oeis.a057;

import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.Japanese;

/**
 * A057888 In Japanese: 1-digit numbers in a-i-u-e-o order, then 2-digit numbers in a-i-u-e-o order, etc.
 * @author Sean A. Irvine
 */
public class A057888 implements Sequence {

  private final TreeMap<String, Integer> mA = new TreeMap<>();
  private int mN = 0;
  private int mLim = 1;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mLim *= 10;
      while (mN < mLim) {
        mA.put(Japanese.SINGLETON.toText(mN), mN);
        ++mN;
      }
    }
    return Z.valueOf(mA.pollFirstEntry().getValue());
  }
}

