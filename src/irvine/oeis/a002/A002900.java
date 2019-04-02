package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a001.A001411;

/**
 * A002900 Number of n-step walks on square lattice.
 * @author Sean A. Irvine
 */
public class A002900 extends A001411 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
