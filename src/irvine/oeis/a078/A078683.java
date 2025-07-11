package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078683 Least prime of the form n*2^m+1 for m&gt;0, or 0 if there is no such prime.
 * @author Sean A. Irvine
 */
public class A078683 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    while (true) {
      t = t.multiply2();
      final Z u = t.add(1);
      if (u.isProbablePrime()) {
        return u;
      }
    }
  }
}

