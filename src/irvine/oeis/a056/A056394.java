package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a288.A288620;

/**
 * A056394 Number of step shifted (decimated) sequence structures using a maximum of five different symbols.
 * @author Sean A. Irvine
 */
public class A056394 extends A288620 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 1).add(t(mN, 2)).add(t(mN, 3)).add(t(mN, 4)).add(t(mN, 5));
  }
}
