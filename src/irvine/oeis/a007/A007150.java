package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a000.A000568;

/**
 * A007150.
 * @author Sean A. Irvine
 */
public class A007150 extends A000568 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z t = super.next();
    t.makeOdd();
    return Z.valueOf(t.auxiliary());
  }
}
