package irvine.oeis.a051;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051499 Nearest integer to tan(n)^3.
 * @author Sean A. Irvine
 */
public class A051499 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.tan(CR.valueOf(++mN)).pow(3).round();
  }
}

