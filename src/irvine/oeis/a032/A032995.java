package irvine.oeis.a032;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032995 If d,e are consecutive digits of n in base 7, then |d-e|&gt;=5.
 * @author Sean A. Irvine
 */
public class A032995 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();

  {
    for (long k = 1; k < base(); ++k) {
      mA.add(Z.valueOf(k));
    }
  }

  protected int base() {
    return 7;
  }

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    final long d = res.mod(base());
    final Z t = res.multiply(base());
    for (long k = 0; k < base(); ++k) {
      if (Math.abs(d - k) > 4) {
        mA.add(t.add(k));
      }
    }
    return res;
  }
}
