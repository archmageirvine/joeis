package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a003.A003714;

/**
 * A022340 Even Fibbinary numbers <code>(A003714);</code> also <code>2*Fibbinary(n)</code>.
 * @author Sean A. Irvine
 */
public class A022340 extends A003714 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
