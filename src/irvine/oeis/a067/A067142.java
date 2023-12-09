package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000085;

/**
 * A067142 One half of the number of Young tableaux with n cells whose shape is asymmetric.
 * @author Sean A. Irvine
 */
public class A067142 extends A000085 {

  private final Sequence mA = new A067136();

  @Override
  public Z next() {
    return super.next().subtract(mA.next()).divide2();
  }
}

