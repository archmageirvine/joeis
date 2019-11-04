package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022344 Allan Wechsler's "J determinant" sequence.
 * @author Sean A. Irvine
 */
public class A022344 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final Z t = CR.PHI.multiply(++mN + 1).floor();
    return t.square().subtract(t.multiply(mN)).subtract(Z.valueOf(mN).square());
  }
}
