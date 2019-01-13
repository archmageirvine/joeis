package irvine.oeis.a001;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a002.A002223;

/**
 * A001985.
 * @author Sean A. Irvine
 */
public class A001985 extends A002223 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z np = super.next();
    return Z.valueOf(LongUtils.classNumber(-np.longValueExact()));
  }
}
