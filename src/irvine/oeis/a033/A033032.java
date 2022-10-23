package irvine.oeis.a033;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033032 Numbers all of whose base 6 digits are odd.
 * @author Sean A. Irvine
 */
public class A033032 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();

  {
    for (int k = 1; k < base(); k += 2) {
      mA.add(Z.valueOf(k));
    }
  }

  protected int base() {
    return 6;
  }

  @Override
  public Z next() {
    while (true) {
      final Z res = mA.pollFirst();
      final Z t = res.multiply(base());
      for (int k = 1; k < base(); k += 2) {
          mA.add(t.add(k));
      }
      return res;
    }
  }
}
