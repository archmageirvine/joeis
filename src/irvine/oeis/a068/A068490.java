package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068490 Fixed point of the morphism 1 -&gt; 121, 2 -&gt; 12, starting from 1.
 * @author Sean A. Irvine
 */
public class A068490 extends Sequence1 {

  private StringBuilder mA = new StringBuilder();

  @Override
  public Z next() {
    if (mA.length() == 0) {
      mA.append('1');
    } else {
      final StringBuilder sb = new StringBuilder();
      for (int k = 0; k < mA.length(); ++k) {
        sb.append(mA.charAt(k) == '1' ? "121" : "12");
      }
      mA = sb;
    }
    return new Z(mA);
  }
}

