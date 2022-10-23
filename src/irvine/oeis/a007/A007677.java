package irvine.oeis.a007;

import irvine.math.cr.CR;
import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007677 Denominators of convergents to e.
 * @author Sean A. Irvine
 */
public class A007677 extends Sequence0 {

  private final Convergents mConvergents = new Convergents(CR.E);

  @Override
  public Z next() {
    return mConvergents.next().den();
  }
}
