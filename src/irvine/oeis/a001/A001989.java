package irvine.oeis.a001;

import irvine.math.LongUtils;
import irvine.math.z.Z;

/**
 * A001989 Class numbers associated with terms of A001988.
 * @author Sean A. Irvine
 */
public class A001989 extends A001988 {

  @Override
  public Z next() {
    final Z np = super.next();
    return Z.valueOf(LongUtils.hurwitzClassNumber(-np.longValueExact()));
  }
}
