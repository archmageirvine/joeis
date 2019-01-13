package irvine.oeis.a178;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000088;
import irvine.oeis.a006.A006608;

/**
 * A178925.
 * @author Sean A. Irvine
 */
public class A178925 extends A000088 {

  private final Sequence mA = new A006608();
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}

