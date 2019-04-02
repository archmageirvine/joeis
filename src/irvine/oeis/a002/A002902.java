package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a001.A001412;

/**
 * A002902 Number of n-step self-avoiding walks on cubic lattice.
 * @author Sean A. Irvine
 */
public class A002902 extends A001412 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
