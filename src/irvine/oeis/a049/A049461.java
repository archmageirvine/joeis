package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000214;
import irvine.oeis.a053.A053037;

/**
 * A049461 Number of equivalence classes of self-dual Boolean functions of n variables under action of LSD(n,2).
 * @author Sean A. Irvine
 */
public class A049461 extends A000214 {

  private final Sequence mA = new A053037();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
