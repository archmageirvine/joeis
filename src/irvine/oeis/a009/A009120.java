package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.a001.A001813;

/**
 * A009120 a(n) = (4n)!/(2n)!.
 * @author Sean A. Irvine
 */
public class A009120 extends A001813 {

  @Override
  public Z next() {
    final Z t = super.next();
    super.next();
    return t;
  }
}
