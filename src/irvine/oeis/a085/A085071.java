package irvine.oeis.a085;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085071 Integers reached in A085068.
 * @author Sean A. Irvine
 */
public class A085071 extends Sequence0 {

  private static final Q C = new Q(4, 3);
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    Q t = Q.valueOf(mN);
    do {
      t = C.multiply(t.ceiling());
    } while (!t.isInteger() || t.toZ().compareTo(mN) < 0);
    return t.toZ();
  }
}

