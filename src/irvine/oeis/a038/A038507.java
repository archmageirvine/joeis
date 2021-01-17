package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A038507 a(n) = n! + 1.
 * @author Sean A. Irvine
 */
public class A038507 extends A000142 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
