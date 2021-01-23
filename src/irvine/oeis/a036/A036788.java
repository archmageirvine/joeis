package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.Roman;

/**
 * A036788 Length of Roman notation for n &lt;= length of decimal representation.
 * @author Sean A. Irvine
 */
public class A036788 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (String.valueOf(++mN).length() >= Roman.roman(mN).length()) {
        return Z.valueOf(mN);
      }
    }
  }
}
