package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a001.A001666;

/**
 * A002903 Number of <code>n-step self-avoiding</code> walks on b.c.c. lattice.
 * @author Sean A. Irvine
 */
public class A002903 extends A001666 {

  @Override
  public Z next() {
    return super.next().add(1).divide2();
  }
}
