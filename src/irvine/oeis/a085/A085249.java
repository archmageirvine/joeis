package irvine.oeis.a085;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a002.A002977;

/**
 * A085249 Terms k of A002977 such that both (k-1)/2 and (k-1)/3 are also terms of A002977.
 * @author Sean A. Irvine
 */
public class A085249 extends A002977 {

  private final HashSet<Z> mA = new HashSet<>();

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final Z t1 = t.subtract(1);
      mA.add(t);
      if (t1.mod(6) == 0 && mA.contains(t1.divide2()) && mA.contains(t1.divide(3))) {
        return t;
      }
    }
  }
}
