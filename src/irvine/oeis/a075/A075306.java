package irvine.oeis.a075;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A075245.
 * @author Sean A. Irvine
 */
public class A075306 extends A000040 {

  private Z[] mP = {super.next()};

  @Override
  public Z next() {
    mP = Arrays.copyOf(mP, mP.length + 1);
    mP[mP.length - 1] = super.next();
    final Z[] divs = new Z[mP.length];
    Arrays.fill(divs, Z.ONE);
    divs[divs.length - 1] = Z.ZERO;
    return ZUtils.chineseRemainderTheorem(divs, mP);
  }
}
