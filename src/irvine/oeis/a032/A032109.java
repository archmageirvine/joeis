package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a000.A000670;

/**
 * A032109 "BIJ" (reversible, indistinct, labeled) transform of 1,1,1,1...
 * @author Sean A. Irvine
 */
public class A032109 extends A000670 {

  @Override
  public Z next() {
    return super.next().add(1).divide2();
  }
}
