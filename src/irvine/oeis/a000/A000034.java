package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000034 Period 2: repeat <code>[1, 2]; a(n) = 1 + (n mod 2)</code>.
 * @author Sean A. Irvine
 */
public class A000034 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return (mN++ & 1) == 0 ? Z.ONE : Z.TWO;
  }
}

