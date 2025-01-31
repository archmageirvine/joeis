package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005580 a(n) = smallest number k such that Product_{i=2..k+1} prime(i)/(prime(i)-1) &gt; n.
 * @author Sean A. Irvine
 */
public class A005580 extends A005579 {

  @Override
  public Z next() {
    final Z res = super.next().subtract(1).max(Z.ZERO);
    super.next();
    return res;
  }
}

