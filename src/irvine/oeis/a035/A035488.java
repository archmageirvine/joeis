package irvine.oeis.a035;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * A035488 3rd column of Stolarsky array.
 * @author Sean A. Irvine
 */
public class A035488 extends A035487 {

  @Override
  public Z next() {
    return CR.valueOf(super.next()).multiply(CR.PHI).round();
  }
}

