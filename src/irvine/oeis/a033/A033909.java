package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A033909 Number of Sort then Add steps needed to reach a sorted number, or -1 if never reach sorted number.
 * @author Sean A. Irvine
 */
public class A033909 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    long c = 0;
    Z m = Z.valueOf(++mN);
    Z t;
    while (!(t = ZUtils.sortDigitsAscending(m)).equals(m)) {
      m = m.add(t);
      ++c;
    }
    return Z.valueOf(c);
  }
}
