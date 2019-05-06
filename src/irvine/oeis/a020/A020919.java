package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A020919 Partition numbers <code>mod 11</code>.
 * @author Sean A. Irvine
 */
public class A020919 extends A000041 {

  private static final Z ELEVEN = Z.valueOf(11);

  @Override
  public Z next() {
    return super.next().mod(ELEVEN);
  }
}
