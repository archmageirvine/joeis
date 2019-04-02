package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a002.A002144;

/**
 * A005098 Numbers n such that 4n + 1 is prime.
 * @author Sean A. Irvine
 */
public class A005098 extends A002144 {

  @Override
  public Z next() {
    return super.next().divide(4);
  }
}

