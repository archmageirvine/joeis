package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014433 <code>a(n) =</code> sum(i=0..n-1, <code>a(i)*a(n-i) ), a(0) = 1, a(1)=4</code>.
 * @author Sean A. Irvine
 */
public class A014433 extends A014431 {

  @Override
  protected Z a1() {
    return Z.FOUR;
  }
}

