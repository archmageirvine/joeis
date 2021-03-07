package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A040051 Parity of partition function A000041.
 * @author Sean A. Irvine
 */
public class A040051 extends A000041 {

  @Override
  public Z next() {
    return super.next().and(Z.ONE);
  }
}
