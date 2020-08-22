package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000032;
import irvine.oeis.a000.A000045;

/**
 * A014718 a(n) = (F(n+1)+L(n)+n)^2 where F(n) are the Fibonacci numbers (A000045) and L(n) are the Lucas numbers (A000032).
 * @author Sean A. Irvine
 */
public class A014718 extends A000045 {

  private final A000032 mLucas = new A000032();
  private long mN = -1;
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().add(mLucas.next()).add(++mN).square();
  }
}

