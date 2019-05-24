package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017663 <code>a(n) = (12*n + 11)^11</code>.
 * @author Sean A. Irvine
 */
public class A017663 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(12);
    return mN.pow(11);
  }
}

