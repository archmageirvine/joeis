package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001466 Denominators of Egyptian fraction expansion of Pi - 3.
 * @author Sean A. Irvine
 */
public class A001466 implements Sequence {

  private CR mEgyptian = CR.PI.subtract(CR.THREE);

  @Override
  public Z next() {
    final Z s = mEgyptian.inverse().ceil(32);
    mEgyptian = mEgyptian.subtract(CR.valueOf(s).inverse());
    return s;
  }
}
