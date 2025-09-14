package irvine.oeis.a005;

import java.util.ArrayList;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005243 A self-generating sequence: start with 1 and 2, take all sums of any number of successive previous elements and adjoin them to the sequence. Repeat!.
 * @author Sean A. Irvine
 */
public class A005243 extends Sequence1 {

  private final TreeSet<Z> mSet = new TreeSet<>();
  private final ArrayList<Z> mA = new ArrayList<>();

  {
    mSet.add(Z.ONE);
    mSet.add(Z.TWO);
  }

  @Override
  public Z next() {
    final Z v = mSet.pollFirst();
    mA.add(v);
    Z s = Z.ZERO;
    for (int i = mA.size() - 1; i >= 0; --i) {
      s = s.add(mA.get(i));
      if (s.compareTo(v) > 0) {
        mSet.add(s);
      }
    }
    return v;
  }
}
