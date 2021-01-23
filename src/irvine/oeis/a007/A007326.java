package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a000.A000293;
import irvine.oeis.a000.A000294;

/**
 * A007326 Difference between A000294 and the number of solid partitions of n (A000293).
 * @author Sean A. Irvine
 */
public class A007326 extends A000294 {

  private final A000293 mP = new A000293();

  @Override
  public Z next() {
    return super.next().subtract(mP.next());
  }
}
