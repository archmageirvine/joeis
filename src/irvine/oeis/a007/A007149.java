package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a000.A000088;

/**
 * A007149.
 * @author Sean A. Irvine
 */
public class A007149 extends A000088 {

  @Override
  public Z next() {
    final Z t = super.next();
    t.makeOdd();
    return Z.valueOf(t.auxiliary());
  }
}
