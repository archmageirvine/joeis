package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005666 Minimal number of moves for the cyclic variant of the Towers of Hanoi for 3 pegs and n disks, with the final peg two steps away.
 * @author Sean A. Irvine
 */
public class A005666 extends A005665 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1).divide2();
  }
}

