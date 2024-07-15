package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071291.
 * @author Sean A. Irvine
 */
public class A071373 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return new A071367(++mN).next();
  }
}
