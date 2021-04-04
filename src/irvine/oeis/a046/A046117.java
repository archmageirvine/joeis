package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a023.A023201;

/**
 * A046117.
 * @author Sean A. Irvine
 */
public class A046117 extends A023201 {

  @Override
  public Z next() {
    return super.next().add(6);
  }
}
