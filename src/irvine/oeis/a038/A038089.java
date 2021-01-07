package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038089 Number of n-node rooted identity trees of height 5.
 * @author Sean A. Irvine
 */
public class A038089 extends A038084 {

  private final Sequence mA = new A038083();
  {
    for (int k = 0; k < 5; ++k) {
      next();
    }
  }

  @Override
  public Z next() {
    final Z u = super.next();
    if (u == null) {
      return null;
    }
    final Z t = mA.next();
    return t == null ? u : u.subtract(t);
  }
}
