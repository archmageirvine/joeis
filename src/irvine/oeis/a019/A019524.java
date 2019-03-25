package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.a007.A007908;

/**
 * A019524.
 * @author Sean A. Irvine
 */
public class A019524 extends A007908 {

  @Override
  public Z next() {
    final String t = super.next().toString();
    return new Z(t + t);
  }
}

