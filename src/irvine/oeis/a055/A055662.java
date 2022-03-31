package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055662 Successive positions in Tower of Hanoi (with three pegs {0,1,2}) where xyz means smallest disk is on peg z, second smallest is on peg y, third smallest on peg x, etc. and leading zeros indicate largest disks are all on peg 0.
 * @author Sean A. Irvine
 */
public class A055662 extends A055661 {

  @Override
  public Z next() {
    return new Z(super.next().toString(3));
  }
}
