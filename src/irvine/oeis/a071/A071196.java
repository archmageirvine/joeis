package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A071196 The sum of the sequence starting with prime(n) and having prime sum defined in A071194, or -1 if no such sequence exists.
 * @author Sean A. Irvine
 */
public class A071196 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next();
    Z s = p;
    do {
      p = mPrime.nextPrime(p);
      s = s.add(p);
    } while (!s.isProbablePrime());
    return s;
  }
}
