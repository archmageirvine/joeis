package irvine.oeis.a027;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027437.
 * @author Sean A. Irvine
 */
public class A027437 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return CR.E.multiply(Z.ONE.shiftLeft(++mN)).floor();
  }
}
