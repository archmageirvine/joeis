package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.oeis.a008.A008683;

/**
 * A014193.
 * @author Sean A. Irvine
 */
public class A014193 extends A000040 {

  private final A008683 mMobius = new A008683();

  @Override
  public Z next() {
    return super.next().add(mMobius.next());
  }
}
