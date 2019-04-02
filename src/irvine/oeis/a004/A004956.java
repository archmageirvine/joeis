package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004956 Ceiling of n*phi, where phi is the golden ratio, A001622.
 * @author Sean A. Irvine
 */
public class A004956 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.PHI.multiply(CR.valueOf(++mN)).ceil(32);
  }
}
