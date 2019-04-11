package irvine.oeis.a005;

import irvine.oeis.a002.A002836;

/**
 * A005980 Let F(x) <code>= 1 + x + 4x^2 + 9x^3 + ... =</code> g.f. for A002835 (solid partitions restricted to two planes) and expand <code>(1-x)(1-x^2)(1-x^3)..</code>.*F(x) in powers of x.
 * @author Sean A. Irvine
 */
public class A005980 extends A002836 {

  @Override
  protected boolean shouldBeCounted() {
    return mP < 2 && mPP <= 2 && super.shouldBeCounted();
  }
}

