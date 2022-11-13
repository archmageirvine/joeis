package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060374 a(n)=p+q, where n=p-q and p, q, p+q are in A005836 (integers written without 2 in base 3).
 * @author Sean A. Irvine
 */
public class A060374 extends A060372 {

  @Override
  public Z next() {
    return super.next().multiply2().subtract(mN);
  }
}
