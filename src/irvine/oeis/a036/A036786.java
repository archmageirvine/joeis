package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.Roman;

/**
 * A036786 Length of Roman notation for n &lt; length of decimal representation.
 * @author Sean A. Irvine
 */
public class A036786 extends Sequence1 {

  private int mN = 9;

  @Override
  public Z next() {
    while (true) {
      if (String.valueOf(++mN).length() > Roman.roman(mN).length()) {
        return Z.valueOf(mN);
      }
    }
  }
}
