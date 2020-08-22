package irvine.oeis.a015;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015557 a(n) = ceiling((n/e)^n).
 * @author Sean A. Irvine
 */
public class A015557 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.pow(CR.valueOf(++mN).divide(CR.E), mN).ceil();
  }
}
