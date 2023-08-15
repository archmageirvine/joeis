package irvine.oeis.a141;

import irvine.math.z.Z;
import irvine.oeis.a115.A115004;

/**
 * A141255 Total number of line segments between points visible to each other in a square n X n lattice.
 * @author Georg Fischer
 */
public class A141255 extends A115004 {

  private long mN = 0;

  @Override
  public Z next() {
    return (++mN == 1) ? Z.ZERO : super.next().multiply2().add(2 * mN * (mN - 1));
  }
}
