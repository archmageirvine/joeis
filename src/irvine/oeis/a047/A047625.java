package irvine.oeis.a047;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047625 Floor( Pi * (3/2)^n ).
 * @author Sean A. Irvine
 */
public class A047625 implements Sequence {

  private Q mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Q.ONE : mA.multiply(3).divide(2);
    return CR.PI.multiply(CR.valueOf(mA)).floor();
  }
}
