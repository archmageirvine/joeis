package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003215 Hex (or centered hexagonal) numbers: 3*n*(n+1)+1 (crystal ball sequence for hexagonal lattice).
 * @author Sean A. Irvine
 */
public class A003215 extends Sequence0 {

  protected long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(3).multiply(mN + 1).add(1);
  }
}
