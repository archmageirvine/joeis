package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000032;
import irvine.oeis.a000.A000045;

/**
 * A014718 <code>a(n) = (F(n+1)+L(n)+n)^2</code> where <code>F(n)</code> are the Fibonacci numbers <code>(A000045)</code> and <code>L(n)</code> are the Lucas numbers <code>(A000032)</code>.
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

