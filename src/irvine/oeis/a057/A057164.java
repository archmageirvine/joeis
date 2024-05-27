package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A057164 Self-inverse permutation of natural numbers induced by reflections of the rooted plane trees and mountain ranges encoded by A014486.
 * @author Sean A. Irvine
 */
public class A057164 extends A014486 {

  /**
   * Reverse.
   * @param n parameter
   * @return reverse
   */
  public static Z bcr(final Z n) {
    final Z mask = Z.ONE.shiftLeft(n.bitLength()).subtract(1);
    return Functions.REVERSE.z(2, n).xor(mask);
  }

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(bcr(super.next()));
  }
}

