package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A003803 Order of universal Chevalley group A_5 (q), q = prime power.
 * @author Sean A. Irvine
 */
public class A003803 extends A000961 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return A003787.orderUniversalChevalleyA(super.next(), 5);
  }
}
