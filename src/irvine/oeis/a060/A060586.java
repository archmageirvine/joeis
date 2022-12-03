package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060586 Minimum number of moves required to reach position n starting from 0 in Tower of Hanoi (with three pegs: 0,1,2), where with position n written in base 3, xyz means smallest disk is on peg z, second smallest is on peg y, third smallest on peg x, etc. and leading zeros indicate largest disks are all on peg 0.
 * @author Sean A. Irvine
 */
public class A060586 extends A060583 {

  @Override
  public Z next() {
    final Z n = super.next();
    if (n.isZero()) {
      return Z.ZERO;
    }
    final String s = n.toString(3);
    long res = 1;
    for (int k = 1; k < s.length(); ++k) {
      res *= 2;
      if (s.charAt(k) != s.charAt(k - 1)) {
        res += 1;
      }
    }
    return Z.valueOf(res);
  }
}
