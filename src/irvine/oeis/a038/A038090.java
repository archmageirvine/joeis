package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038090 Number of n-node rooted identity trees of height 6.
 * @author Sean A. Irvine
 */
public class A038090 extends A038085 {

  private final Sequence mA = new A038084();
  {
    for (int k = 0; k < 6; ++k) {
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
