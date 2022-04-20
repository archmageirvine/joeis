package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056370 Number of primitive (period n) bracelet structures using exactly six different colored beads.
 * @author Sean A. Irvine
 */
public class A056370 extends A056365 {

  private final Sequence mA = new A056364();
  {
    next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
