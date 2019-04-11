package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a001.A001850;

/**
 * A047665 Expansion of <code>(1/sqrt(1-6*x+x^2)-1/(1-x))/2</code>.
 * @author Sean A. Irvine
 */
public class A047665 extends A001850 {

  @Override
  public Z next() {
    return super.next().subtract(1).divide2();
  }
}

