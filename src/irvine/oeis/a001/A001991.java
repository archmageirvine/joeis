package irvine.oeis.a001;

import irvine.math.LongUtils;
import irvine.math.z.Z;

/**
 * A001991 Class numbers associated with entries of <code>A001990</code>.
 * @author Sean A. Irvine
 */
public class A001991 extends A001990 {

  @Override
  public Z next() {
    final Z np = super.next().multiply(8);
    return Z.valueOf(LongUtils.classNumber(-np.longValueExact()));
  }
}
