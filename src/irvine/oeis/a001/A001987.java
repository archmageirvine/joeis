package irvine.oeis.a001;

import irvine.math.LongUtils;
import irvine.math.z.Z;

/**
 * A001987 Class numbers associated with entries of A001986.
 * @author Sean A. Irvine
 */
public class A001987 extends A001986 {

  @Override
  public Z next() {
    final Z np = super.next();
    return Z.valueOf(LongUtils.classNumber(-np.longValueExact()));
  }
}
