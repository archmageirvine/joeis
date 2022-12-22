package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014434 a(n) = Sum_{i=0..n-1} a(i) * a(n-i), a(0) = 1, a(1) = 5.
 * @author Sean A. Irvine
 */
public class A014434 extends A014431 {

  {
    setOffset(0);
  }

  @Override
  protected Z a1() {
    return Z.FIVE;
  }
}

