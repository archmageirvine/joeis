package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038091 Number of n-node rooted identity trees of height 7.
 * @author Sean A. Irvine
 */
public class A038091 extends A038086 {

  private final Sequence mA = new A038085();
  {
    for (int k = 0; k < 7; ++k) {
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
