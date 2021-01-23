package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A003808 Order of simple Chevalley group A_3(q) (or D_3(q)), q = prime power.
 * @author Sean A. Irvine
 */
public class A003808 extends A000961 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return A003793.orderSimpleChevalleyA(super.next(), 3);
  }
}
