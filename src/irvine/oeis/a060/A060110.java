package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060110 Numbers in Morse code, with 1 for a dot, 2 for a dash and 0 between digits/letters and then converted from base 3 to base 10.
 * @author Sean A. Irvine
 */
public class A060110 extends A060109 {

  @Override
  public Z next() {
    return new Z(super.next().toString(), 3);
  }
}
