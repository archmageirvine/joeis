package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a000.A000043;

/**
 * A050475 Numbers n such that x = 2^n-2 satisfies phi(x)+2 = phi(x+2).
 * @author Sean A. Irvine
 */
public class A050475 extends A000043 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
