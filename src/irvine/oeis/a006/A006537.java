package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006537 Worst cases for Pierce expansions (numerators).
 * @author Sean A. Irvine
 */
public class A006537 extends A006538 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mMinB.get(mN));
  }

}
