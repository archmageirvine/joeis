package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A003807 Order of simple Chevalley group A_2(q), q = prime power.
 * @author Sean A. Irvine
 */
public class A003807 extends A000961 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return A003793.orderSimpleChevalleyA(super.next(), 2);
  }
}
