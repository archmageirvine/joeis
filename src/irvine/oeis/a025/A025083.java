package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a005.A005408;

/**
 * A025083 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = (Fibonacci numbers), t = (odd natural numbers).
 * @author Sean A. Irvine
 */
public class A025083 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025083() {
    super(new A000045(), new PrependSequence(new A005408(), 0), false);
    next();
  }
}
