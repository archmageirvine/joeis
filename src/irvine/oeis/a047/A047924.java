package irvine.oeis.a047;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047924 a(n) = B_{A_n+1}+1, where A_n = floor(n*phi) = A000201(n), B_n = floor(n*phi^2) = A001950(n) and phi is the golden ratio.
 * @author Sean A. Irvine
 */
public class A047924 implements Sequence {

  private static final CR PHI2 = CR.PHI.multiply(CR.PHI);
  private long mN = -1;

  @Override
  public Z next() {
    return PHI2.multiply(CR.PHI.multiply(++mN).floor().add(1)).floor().add(1);
  }
}
