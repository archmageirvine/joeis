package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014335 Exponential convolution of Fibonacci numbers with themselves (divided by <code>2)</code>.
 * @author Sean A. Irvine
 */
public class A014335 extends A014334 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

