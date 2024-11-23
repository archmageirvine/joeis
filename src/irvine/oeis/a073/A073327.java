package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.English;

/**
 * A073259.
 * @author Sean A. Irvine
 */
public class A073327 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final String s = English.SINGLETON.toRawText(++mN);
    long sum = 0;
    for (int k = 0; k < s.length(); ++k) {
      sum += s.charAt(k) - '`';
    }
    return Z.valueOf(sum);
  }
}

