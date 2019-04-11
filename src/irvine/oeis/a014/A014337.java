package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014337 Three-fold exponential convolution of Fibonacci numbers with themselves (divided by <code>6)</code>.
 * @author Sean A. Irvine
 */
public class A014337 extends A014336 {

  @Override
  public Z next() {
    return super.next().divide(6);
  }
}

