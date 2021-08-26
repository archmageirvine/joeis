package irvine.oeis.a032;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032988 Numbers k such that if d,e are consecutive digits of k in base 6, then |d-e| &gt;= 4.
 * @author Sean A. Irvine
 */
public class A032988 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();

  {
    for (long k = 1; k < base(); ++k) {
      mA.add(Z.valueOf(k));
    }
  }

  protected int base() {
    return 6;
  }

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    final long d = res.mod(base());
    final Z t = res.multiply(base());
    for (long k = 0; k < base(); ++k) {
      if (Math.abs(d - k) > 3) {
        mA.add(t.add(k));
      }
    }
    return res;
  }
}
