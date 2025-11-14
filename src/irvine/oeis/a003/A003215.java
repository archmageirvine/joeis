package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A003215 Hex (or centered hexagonal) numbers: 3*n*(n+1)+1 (crystal ball sequence for hexagonal lattice).
 * @author Sean A. Irvine
 */
public class A003215 extends Sequence0 implements DirectSequence {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return a(mN);
  }

  @Override
  public Z a(final Z n) {
    return n.multiply(3).multiply(n.add(1)).add(1);
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(n).multiply(3).multiply(n + 1).add(1);
  }

}
