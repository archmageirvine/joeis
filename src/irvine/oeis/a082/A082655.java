package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A082655 Number of distinct letters needed to spell English names of numbers 1 through n.
 * @author Sean A. Irvine
 */
public class A082655 extends Sequence1 {

  private int mN = 0;
  private long mSeen = 0;

  @Override
  public Z next() {
    final String s = English.SINGLETON.toRawText(++mN);
    for (int k = 0; k < s.length(); ++k) {
      mSeen |= 1L << (s.charAt(k) - 'a');
    }
    return Z.valueOf(Long.bitCount(mSeen));
  }
}
