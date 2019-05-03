package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A003847 Order of universal Chevalley group <code>D_8(q), q =</code> prime power.
 * @author Sean A. Irvine
 */
public class A003847 extends A000961 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return A003830.orderUniversalChevalleyD(super.next(), 8);
  }
}
