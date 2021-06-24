package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a014.A014847;

/**
 * A048618 Even numbers n such that binomial(n,n/2) is divisible by n/2.
 * @author Sean A. Irvine
 */
public class A048618 extends A014847 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}

