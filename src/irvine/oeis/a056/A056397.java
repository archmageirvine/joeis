package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a288.A288620;

/**
 * A056397 Number of step shifted (decimated) sequence structures using exactly three different symbols.
 * @author Sean A. Irvine
 */
public class A056397 extends A288620 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 3);
  }
}
