package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.a385.A385240;

/**
 * A387241 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A387241 extends A385240 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 5);
  }
}

