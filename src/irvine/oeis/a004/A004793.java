package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a003.A003278;

/**
 * A004793 <code>a(1)=1, a(2)=3</code>; <code>a(n)</code> is least k such that no three terms of <code>a(1), a(2), ..., a(n-1), k</code> form an arithmetic progression.
 * @author Sean A. Irvine
 */
public class A004793 extends A003278 {

  @Override
  public Z next() {
    return super.next().add(mN & 1);
  }
}
