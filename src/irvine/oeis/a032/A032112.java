package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a006.A006155;

/**
 * A032112 "BIJ" (reversible, indistinct, labeled) transform of 2,1,1,1...
 * @author Sean A. Irvine
 */
public class A032112 extends A006155 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().add(2).divide2();
  }
}
