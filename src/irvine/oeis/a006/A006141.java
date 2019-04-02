package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a003.A003106;
import irvine.oeis.a003.A003114;

/**
 * A006141 Number of balanced partitions of n: the smallest part equals the number of parts.
 * @author Sean A. Irvine
 */
public class A006141 extends A003114 {

  private A003106 mOther = new A003106();

  {
    next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mOther.next());
  }
}
