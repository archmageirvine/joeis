package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033809 Smallest m&gt;0 such that (2n-1)2^m+1 is prime, or -1 if no such value exists.
 * @author Sean A. Irvine
 */
public class A033809 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    Z t = Z.valueOf(mN);
    long m = 0;
    do {
      t = t.multiply2();
      ++m;
    } while (!t.add(1).isProbablePrime());
    return Z.valueOf(m);
  }
}
