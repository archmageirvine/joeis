package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002821 <code>a(n) =</code> nearest integer to <code>n^(3/2)</code>.
 * @author Sean A. Irvine
 */
public class A002821 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return CR.valueOf(mN.pow(3)).sqrt().round();
  }
}
