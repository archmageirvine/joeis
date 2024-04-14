package irvine.oeis.a035;

import irvine.math.function.Functions;
import irvine.math.z.ZUtils;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000578;
import irvine.util.string.StringUtils;

/**
 * A035124 Nonpalindromic cubes remaining cubic which written backwards: take the cube root of n, reverse its digits, cube that and the result is n with its digits reversed.
 * @author Sean A. Irvine
 */
public class A035124 extends FilterSequence {

  /** Construct the sequence. */
  public A035124() {
    super(1, new A000578(), cube -> {
      return cube.mod(10) != 0 && !StringUtils.isPalindrome(cube.toString()) && ZUtils.isCube(Functions.REVERSE.z(cube));
    });
  }
}

