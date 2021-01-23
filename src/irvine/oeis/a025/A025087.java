package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a014.A014306;

/**
 * A025087 s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = (Fibonacci numbers), t = A014306.
 * @author Sean A. Irvine
 */
public class A025087 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025087() {
    super(new A000045(), new A014306(), false);
    next();
  }
}
