package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009707;

/**
 * A024265 Expansion of tan(tan(x) * x)/2.
 * @author Sean A. Irvine
 */
public class A024265 extends A009707 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

