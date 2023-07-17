package irvine.oeis.a001;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a002.A002223;

/**
 * A001985 Class numbers of quadratic fields.
 * @author Sean A. Irvine
 */
public class A001985 extends A002223 {

  /** Construct the sequence. */
  public A001985() {
    super(3);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z np = super.next();
    return Z.valueOf(LongUtils.hurwitzClassNumber(-np.longValueExact()));
  }
}
