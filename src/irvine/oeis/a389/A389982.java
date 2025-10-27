package irvine.oeis.a389;

import java.util.Comparator;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.German;

/**
 * A389982 allocated for Johann Peters.
 * @author Sean A. Irvine
 */
public class A389982 extends Sequence1 {

  private int mN = 0;
  private final TreeSet<Integer> mA = new TreeSet<>(Comparator.comparing(German.SINGLETON::toRawText));

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      ++mN;
      for (int k = 1; k <= mN; ++k) {
        mA.add(k);
      }
    }
    return Z.valueOf(mA.pollFirst());
  }
}

