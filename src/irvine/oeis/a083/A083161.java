package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.a099.A099552;

/**
 * A083161 a(n) = (concatenation of the first n terms of A099552)/n.
 * @author Sean A. Irvine
 */
public class A083161 extends A099552 {

  @Override
  public Z next() {
    super.next();
    return mA.divide(mN);
  }
}

