package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046068 Second smallest m such that (2n-1)2^m+1 is prime, or -1 if no such value exists.
 * @author Sean A. Irvine
 */
public class A046068 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    Z n = Z.valueOf(mN);
    boolean seenFirst = false;
    long m = 0;
    while (true) {
      while (!n.add(1).isProbablePrime()) {
        n = n.multiply2();
        ++m;
      }
      if (seenFirst) {
        break;
      }
      n = n.multiply2();
      ++m;
      seenFirst = true;
    }
    return Z.valueOf(m);
  }
}
