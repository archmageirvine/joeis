package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000578;
import irvine.util.string.StringUtils;

/**
 * A035124 Nonpalindromic cubes remaining cubic which written backwards: take the cube root of n, reverse its digits, cube that and the result is n with its digits reversed.
 * @author Sean A. Irvine
 */
public class A035124 extends A000578 {

  @Override
  public Z next() {
    while (true) {
      final Z cube = super.next();
      if (cube.mod(10) != 0 && !StringUtils.isPalindrome(cube.toString())) {
        final Z rev = ZUtils.reverse(cube);
        rev.root(3);
        if (rev.auxiliary() == 1) {
          return cube;
        }
      }
    }
  }
}

