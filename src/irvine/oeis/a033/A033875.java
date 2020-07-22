package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033875 Skipping from prime to prime by least powers of 2.
 * @author Sean A. Irvine
 */
public class A033875 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      Z t = Z.ONE;
      while (!mA.add(t).isProbablePrime()) {
        t = t.multiply2();
      }
      mA = mA.add(t);
    }
    return mA;
  }
}
