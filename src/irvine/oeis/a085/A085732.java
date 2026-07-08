package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a000.A000796;

/**
 * A085732 Smallest number obtained by placing a + in the first n digits of decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A085732 extends Sequence2 {

  private final StringBuilder mS = new StringBuilder();
  private final Sequence mPi = new A000796();
  {
    mS.append(mPi.next());
  }

  @Override
  public Z next() {
    mS.append(mPi.next());
    Z min = new Z(mS);
    for (int k = 1; k < mS.length(); ++k) {
      final Z c = new Z(mS.substring(0, k)).add(new Z(mS.substring(k)));
      if (c.compareTo(min) < 0) {
        min = c;
      }
    }
    return min;
  }
}
