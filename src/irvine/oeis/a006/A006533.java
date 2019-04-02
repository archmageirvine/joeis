package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a007.A007678;

/**
 * A006533 Join n equal points around circle in all ways, count regions.
 * @author Sean A. Irvine
 */
public class A006533 extends A007678 {

  @Override
  public Z next() {
    return super.next().add(mN);
  }
}
