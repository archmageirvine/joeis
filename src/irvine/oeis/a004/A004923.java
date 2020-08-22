package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004923 Floor of n*phi^8, where phi is the golden ratio, A001622.
 * @author Sean A. Irvine
 */
public class A004923 implements Sequence {

  private static final CR PHI8 = ComputableReals.SINGLETON.pow(CR.PHI, 8);

  private long mN = -1;

  @Override
  public Z next() {
    return PHI8.multiply(++mN).floor();
  }
}
