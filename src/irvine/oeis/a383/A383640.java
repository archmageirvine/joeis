package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383640 allocated for Shyam Sunder Gupta.
 * @author Sean A. Irvine
 */
public class A383640 extends Sequence1 {

  private Z mN = Z.valueOf(55);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final String s = mN.pow(3).toString();
      if (mN.mod(10) != 0 && s.substring(1, s.length() - 1).contains(mN.toString())) {
        return mN;
      }
    }
  }
}
