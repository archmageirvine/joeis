package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009767;

/**
 * A024348 Expansion of tan(x^2).
 * @author Sean A. Irvine
 */
public class A024348 extends A009767 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}

