package irvine.oeis.a005;

import irvine.oeis.a003.A003288;

/**
 * A005545 Number of n-step self-avoiding walks on f.c.c. lattice from <code>(0,0,0)</code> to <code>(0,1,3)</code>.
 * @author Sean A. Irvine
 */
public class A005545 extends A003288 {

  @Override
  protected int first() {
    return 3;
  }

  @Override
  protected long search() {
    final int tx = 0;
    final int ty = 1;
    final int tz = 3;
    // todo Cf. A003288 there are probably exploitable symmetries here
    return search(0, 0, 0, tx, ty, tz, mN, 1); // Basic search
  }
}
