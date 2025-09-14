package irvine.oeis.a080;

import java.util.ArrayList;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080338 Product of consecutive previous terms (starting with 2,3).
 * @author Sean A. Irvine
 */
public class A080338 extends Sequence1 {

  private final TreeSet<Z> mSet = new TreeSet<>();
  private final ArrayList<Z> mA = new ArrayList<>();

  {
    mSet.add(Z.TWO);
    mSet.add(Z.THREE);
  }

  @Override
  public Z next() {
    Z v = mSet.pollFirst();
    mA.add(v);
    Z s = Z.ONE;
    for (int i = mA.size() - 1; i >= 0; --i) {
      s = s.multiply(mA.get(i));
      if (s.compareTo(v) > 0) {
        mSet.add(s);
      }
    }
    return v;
  }
}
