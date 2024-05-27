package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;
import irvine.oeis.a057.A057164;
import irvine.oeis.a057.A057501;

/**
 * A069889 Self-inverse permutation of natural numbers induced by the automorphism RotateHandshakes_et_DeepReverse! acting on the parenthesizations encoded by A014486.
 * @author Sean A. Irvine
 */
public class A069889 extends A014486 {

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(A057164.bcr(A057501.rotateHandshakes(super.next())));
  }
}
