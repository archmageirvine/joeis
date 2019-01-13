package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.a002.A002931;

/**
 * A010566.
 * @author Sean A. Irvine
 */
public class A010566 extends A002931 {

  @Override
  public Z next() {
    return super.next().multiply(2 * mN);
  }
}

