package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.a391.A391498;

/**
 * A393545 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A393545 extends A391498 {

  private int mN = 0;

  @Override
  protected Z select(final long prepack, final long count) {
    return Z.valueOf(prepack - count);
  }

  @Override
  public Z next() {
    return t(++mN, 4);
  }
}

