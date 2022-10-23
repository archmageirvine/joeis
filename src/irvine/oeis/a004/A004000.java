package irvine.oeis.a004;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A004000 RATS: Reverse Add Then Sort the digits applied to previous term, starting with 1.
 * @author Sean A. Irvine
 */
public class A004000 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final Z r = ZUtils.reverse(mA);
      final Z a = r.add(mA);
      final char[] decimal = a.toString().toCharArray();
      Arrays.sort(decimal);
      mA = new Z(new String(decimal));
    }
    return mA;
  }
}
