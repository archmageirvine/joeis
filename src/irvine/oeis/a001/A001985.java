package irvine.oeis.a001;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a002.A002223;

/**
 * A001985 Class numbers associated with terms of A002223.
 * @author Sean A. Irvine
 */
public class A001985 extends A002223 {

  @Override
  public Z next() {
    final Z np = super.next();
    return Z.valueOf(LongUtils.hurwitzClassNumber(-np.longValueExact()));
  }
}
