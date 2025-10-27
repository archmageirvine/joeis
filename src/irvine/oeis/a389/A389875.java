package irvine.oeis.a389;

import java.util.Collections;
import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A389875 Arrangement of numbers such that every digit rotation of the number n is included in descending order after those of n-1.
 * @author Sean A. Irvine
 */
public class A389875 extends Sequence0 {

  private final LinkedList<Z> mA = new LinkedList<>();
  private long mN = -1;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      final String s = String.valueOf(++mN);
      for (int k = 0; k < s.length(); ++k) {
        mA.add(new Z(s.substring(k) + s.substring(0, k)));
        Collections.sort(mA);
      }
    }
    return mA.pollLast();
  }
}
