package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.English;

/**
 * A016037 Map numbers to number of letters in English name; sequence gives number of steps to converge (to 4).
 * @author Sean A. Irvine
 */
public class A016037 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    long c = 0;
    int m = ++mN;
    while (m != 4) {
      m = English.SINGLETON.toRawText(m).length();
      ++c;
    }
    return Z.valueOf(c);
  }
}
