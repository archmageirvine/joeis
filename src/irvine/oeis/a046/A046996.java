package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a001.A001181;

/**
 * A046996 Number of Baxter permutations: A001181/2.
 * @author Sean A. Irvine
 */
public class A046996 extends A001181 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
