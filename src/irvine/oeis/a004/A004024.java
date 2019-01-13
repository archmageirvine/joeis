package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a045.A045831;

/**
 * A004024.
 * @author Sean A. Irvine
 */
public class A004024 extends A045831 {

  @Override
  public Z next() {
    return super.next().shiftLeft(2);
  }
}
