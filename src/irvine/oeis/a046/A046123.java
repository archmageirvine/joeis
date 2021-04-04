package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a023.A023271;

/**
 * A046123.
 * @author Sean A. Irvine
 */
public class A046123 extends A023271 {

  @Override
  public Z next() {
    return super.next().add(12);
  }
}
