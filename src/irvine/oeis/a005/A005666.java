package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005666 Tower of Hanoi with 3 pegs and cyclic moves only (counterclockwise).
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

