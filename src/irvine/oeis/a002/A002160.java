package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002160 Nearest integer to <code>Pi^n</code>.
 * @author Sean A. Irvine
 */
public class A002160 implements Sequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  private long mN = -1;

  @Override
  public Z next() {
    return REALS.pow(CR.PI, ++mN).add(CR.HALF).floor(32);
  }
}
