package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A003852 Order of simple Chevalley group <code>D_6(q), q =</code> prime power.
 * @author Sean A. Irvine
 */
public class A003852 extends A000961 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return A003837.orderSimpleChevalleyD(super.next(), 6);
  }
}
