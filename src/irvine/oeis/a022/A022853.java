package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022853 <code>a(n) =</code> integer nearest <code>n*Pi</code>.
 * @author Sean A. Irvine
 */
public class A022853 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.PI.multiply(++mN).round();
  }
}
