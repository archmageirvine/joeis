package irvine.oeis.a122;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A122458 "Dropping time" of the reduced Collatz iteration starting with 2n+1.
 * @author Sean A. Irvine
 */
public class A122458 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 1) {
      return Z.ZERO;
    }
    final Z m = Z.valueOf(mN);
    Z t = m;
    long cnt = 0;
    while (t.compareTo(m) >= 0) {
      t = Functions.COLLATZ.z(t).makeOdd();
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

