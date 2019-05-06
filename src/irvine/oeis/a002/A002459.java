package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.CR;

/**
 * A002459 Nearest integer to <code>cosh(n)</code>.
 * @author Sean A. Irvine
 */
public class A002459 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.cosh(CR.valueOf(++mN)).round();
  }
}
