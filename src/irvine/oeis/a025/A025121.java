package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000201;
import irvine.oeis.a014.A014306;

/**
 * A025121 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = A000201 (lower Wythoff sequence), t = A014306.
 * @author Sean A. Irvine
 */
public class A025121 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025121() {
    super(new PrependSequence(new A000201(), 0), new A014306(), false);
    next();
  }
}
