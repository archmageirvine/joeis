package irvine.oeis.a033;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033042 Sums of distinct powers of 5.
 * @author Sean A. Irvine
 */
public class A033042 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();

  {
    mA.add(Z.ZERO);
  }

  protected int base() {
    return 5;
  }

  @Override
  public Z next() {
    while (true) {
      final Z res = mA.pollFirst();
      final Z t = res.multiply(base());
      if (!Z.ZERO.equals(t)) {
        mA.add(t);
      }
      mA.add(t.add(1));
      return res;
    }
  }
}
