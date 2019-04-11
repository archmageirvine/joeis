package irvine.oeis.a015;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015554 <code>a(n) = floor(</code> (n/e)^n ).
 * @author Sean A. Irvine
 */
public class A015554 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.pow(CR.valueOf(++mN).divide(CR.E), mN).floor(32);
  }
}
