package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065854 Smallest prime q such that (p^q-1)/(p-1) is a prime, where p = prime(n).
 * @author Sean A. Irvine
 */
public class A065854 extends A065813 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      super.next();
      return Z.TWO;
    }
    return super.next().multiply2().add(1);
  }
}

