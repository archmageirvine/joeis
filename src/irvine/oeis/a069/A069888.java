package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;
import irvine.oeis.a057.A057164;
import irvine.oeis.a057.A057501;

/**
 * A069888 Self-inverse permutation of natural numbers induced by the automorphism DeepReverse_et_RotateHandshakes! acting on the parenthesizations encoded by A014486.
 * @author Sean A. Irvine
 */
public class A069888 extends A014486 {

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(A057501.rotateHandshakes(A057164.bcr(super.next())));
  }
}
