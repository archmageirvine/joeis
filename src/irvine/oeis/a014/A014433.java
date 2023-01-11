package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014433 a(n) = Sum_{i=0..n-1} a(i)*a(n-i), with a(0) = 1 and a(1) = 4.
 * @author Sean A. Irvine
 */
public class A014433 extends A014431 {

  {
    setOffset(0);
  }

  @Override
  protected Z a1() {
    return Z.FOUR;
  }
}

