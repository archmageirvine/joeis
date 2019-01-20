package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a001.A001850;

/**
 * A047665.
 * @author Sean A. Irvine
 */
public class A047665 extends A001850 {

  @Override
  public Z next() {
    return super.next().subtract(1).divide2();
  }
}

