package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383357 allocated for Claude H. R. Dequatre.
 * @author Sean A. Irvine
 */
public class A383357 extends Sequence1 {

  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mSum = mSum.add(Z.TEN.pow(++mN).add(mN));
      if (Functions.REVERSE.z(mSum).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

