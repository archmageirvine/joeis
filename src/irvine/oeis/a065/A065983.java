package irvine.oeis.a065;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065983 Palindromes whose digit sum is 4.
 * @author Sean A. Irvine
 */
public class A065983 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.FOUR);
    mA.add(Z.valueOf(22));
    mA.add(Z.valueOf(121));
    mA.add(Z.valueOf(1111));
  }

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    final long r = res.mod(10);
    if (r == 2) {
      mA.add(res.subtract(2).multiply(10).add(2));
    } else if (r == 1) {
      final String s = res.toString();
      final int twoPos = s.indexOf('2');
      if (twoPos >= 0) {
        mA.add(new Z(s.substring(0, twoPos) + "020" + s.substring(twoPos + 1)));
      } else {
        final int onePos = s.indexOf('1', 1);
        mA.add(new Z(s.substring(0, onePos) + '0' + s.substring(onePos, s.length() - onePos) + '0' + s.substring(s.length() - onePos)));
        if ((s.length() & 1) == 0) {
          mA.add(new Z(s.substring(0, s.length() / 2) + '0' + s.substring(s.length() / 2)));
          mA.add(new Z(s.substring(0, s.length() / 2) + "00" + s.substring(s.length() / 2)));
        }
      }
    }
    return res;
  }
}
