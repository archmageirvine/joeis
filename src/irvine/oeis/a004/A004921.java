package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004921 Floor of n*phi^6, phi = golden ratio, A001622.
 * @author Sean A. Irvine
 */
public class A004921 implements Sequence {

  private static final CR PHI6 = ComputableReals.SINGLETON.pow(CR.PHI, 6);

  private long mN = -1;

  @Override
  public Z next() {
    return PHI6.multiply(++mN).floor();
  }
}
