package irvine.oeis.a032;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032974 Numbers n with property that all pairs of consecutive base 3 digits differ by 0 or 1.
 * @author Sean A. Irvine
 */
public class A032974 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();

  {
    for (long k = 1; k < base(); ++k) {
      mA.add(Z.valueOf(k));
    }
  }

  protected int base() {
    return 3;
  }

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    final long d = res.mod(base());
    final Z t = res.multiply(base());
    for (long k = 0; k < base(); ++k) {
      if (Math.abs(d - k) <= 1) {
        mA.add(t.add(k));
      }
    }
    return res;
  }
}
