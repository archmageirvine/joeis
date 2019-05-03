package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A003804 Order of universal Chevalley group <code>A_6(q), q =</code> prime power.
 * @author Sean A. Irvine
 */
public class A003804 extends A000961 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return A003787.orderUniversalChevalleyA(super.next(), 6);
  }
}
