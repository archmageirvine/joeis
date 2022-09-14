package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a026.A026905;
import irvine.oeis.a026.A026906;

/**
 * A059218 Numbers k that divide the sum of the first k partition numbers (A000041) and the sum of the first k unique partition numbers (A000009).
 * @author Sean A. Irvine
 */
public class A059218 extends A026905 {

  private final Sequence mA = new A026906();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().add(mA.next()).mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
