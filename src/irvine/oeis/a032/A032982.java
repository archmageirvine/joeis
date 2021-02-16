package irvine.oeis.a032;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032982 Numbers with the property that all pairs of consecutive base-5 digits differ by more than 2.
 * @author Sean A. Irvine
 */
public class A032982 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();

  {
    for (long k = 1; k < base(); ++k) {
      mA.add(Z.valueOf(k));
    }
  }

  protected int base() {
    return 5;
  }

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    final long d = res.mod(base());
    final Z t = res.multiply(base());
    for (long k = 0; k < base(); ++k) {
      if (Math.abs(d - k) > 2) {
        mA.add(t.add(k));
      }
    }
    return res;
  }
}
