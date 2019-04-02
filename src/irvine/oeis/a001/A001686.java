package irvine.oeis.a001;

import irvine.math.q.Q;
import irvine.math.z.Z;

import java.util.ArrayList;

/**
 * A001686 From a continued fraction.
 * @author Sean A. Irvine
 */
public class A001686 extends A001684 {

  // There is probably a much smarter way of doing this continued fraction

  private final ArrayList<Z> mB = new ArrayList<>();

  @Override
  public Z next() {
    final Z b = super.next();
    Q cf = new Q(b);
    for (int k = mB.size() - 1; k >= 0; --k) {
      cf = cf.reciprocal().add(mB.get(k));
    }
    mB.add(b);
    return cf.den();
  }
}
