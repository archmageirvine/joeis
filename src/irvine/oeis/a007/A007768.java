package irvine.oeis.a007;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007768.
 * @author Sean A. Irvine
 */
public class A007768 implements Sequence {

  // Engel product expansion

  private Q mA = null;
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    mA = mA == null ? new Q(4, 7) : mA.multiply(mP).divide(mP.subtract(1));
    final Z a = Q.ONE.subtract(mA).multiply(mP).reciprocal().toZ().add(1);
    mP = mP.multiply(a);
    return a;
  }
}
