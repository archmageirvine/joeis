package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014435 a(n) = Sum_{i=0..n-1} a(i)*a(n-i) with a(0)=1, a(1)=6.
 * @author Sean A. Irvine
 */
public class A014435 extends A014431 {

  {
    setOffset(0);
  }

  @Override
  protected Z a1() {
    return Z.SIX;
  }
}

