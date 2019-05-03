package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A003809 Order of simple Chevalley group <code>A_4(q), q =</code> prime power.
 * @author Sean A. Irvine
 */
public class A003809 extends A000961 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return A003793.orderSimpleChevalleyA(super.next(), 4);
  }
}
