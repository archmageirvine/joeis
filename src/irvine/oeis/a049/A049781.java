package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000959;

/**
 * A049781 a(n) = (b(n) + 1)/2, where b = A000959 (the lucky numbers).
 * @author Sean A. Irvine
 */
public class A049781 extends A000959 {

  @Override
  public Z next() {
    return super.next().add(1).divide2();
  }
}
