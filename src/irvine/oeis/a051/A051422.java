package irvine.oeis.a051;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051422 Nearest integer to cosecant(n).
 * @author Sean A. Irvine
 */
public class A051422 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.csc(CR.valueOf(++mN)).round();
  }
}
