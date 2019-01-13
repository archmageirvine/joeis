package irvine.oeis.a005;

import irvine.oeis.a003.A003288;

/**
 * A005548.
 * @author Sean A. Irvine
 */
public class A005548 extends A003288 {

  @Override
  protected int first() {
    return 3;
  }

  @Override
  protected long search() {
    final int tx = 2;
    final int ty = 2;
    final int tz = 2;
    // todo Cf. A003288 there are probably exploitable symmetries here
    return search(0, 0, 0, tx, ty, tz, mN, 1); // Basic search
  }
}
