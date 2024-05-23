package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;
import irvine.oeis.a057.A057162;
import irvine.oeis.a057.A057509;

/**
 * A069775 Permutation of natural numbers induced by the automorphism gma069775! acting on the parenthesizations encoded by A014486.
 * @author Sean A. Irvine
 */
public class A069775 extends A014486 {

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(A057162.reflectBinTree(A057509.rotateBottomBranchesLeft(A057162.reflectBinTree(super.next()))));
  }
}
