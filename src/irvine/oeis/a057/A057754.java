package irvine.oeis.a057;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057754 Integer nearest to Li(10^n), where Li(x) = integral(0..x, dt/log(t)).
 * @author Sean A. Irvine
 */
public class A057754 implements Sequence {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(10);
    return CR.valueOf(mA).li().round();
  }
}
