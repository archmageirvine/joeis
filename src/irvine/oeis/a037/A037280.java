package irvine.oeis.a037;

import irvine.math.z.Z;

/**
 * A037280.
 * @author Sean A. Irvine
 */
public class A037280 extends A037279 {

  @Override
  public Z next() {
    return super.next().makeOdd();
  }
}

