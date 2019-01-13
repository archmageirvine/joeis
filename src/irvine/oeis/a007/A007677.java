package irvine.oeis.a007;

import irvine.math.cr.CR;
import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007677.
 * @author Sean A. Irvine
 */
public class A007677 implements Sequence {

  private final Convergents mConvergents = new Convergents(CR.E);

  @Override
  public Z next() {
    return mConvergents.next().den();
  }
}
