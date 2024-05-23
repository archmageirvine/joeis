package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;
import irvine.oeis.a057.A057162;

/**
 * A069787 Self-inverse permutation of natural numbers induced by the automorphism DeepRev1CarSide! acting on the parenthesizations encoded by A014486.
 * @author Sean A. Irvine
 */
public class A069787 extends A014486 {

  private static Z bcr(final Z n) {
    final Z mask = Z.ONE.shiftLeft(n.bitLength()).subtract(1);
    return Functions.REVERSE.z(2, n).xor(mask);
  }

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(A057162.reflectBinTree(bcr(A057162.reflectBinTree(super.next()))));
  }
}

