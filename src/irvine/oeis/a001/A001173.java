package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000595;

/**
 * A001173 Relations on n unlabeled points.
 * @author Sean A. Irvine
 */
public class A001173 extends A000595 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

