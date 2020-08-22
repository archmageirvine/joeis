package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005408;
import irvine.oeis.a014.A014306;

/**
 * A025116 s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = (odd natural numbers), t = A014306.
 * @author Sean A. Irvine
 */
public class A025116 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025116() {
    super(new PrependSequence(new A005408(), 0), new A014306(), false);
    next();
  }
}
