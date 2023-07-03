package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a014.A014306;
import irvine.oeis.a023.A023531;

/**
 * A024890 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = A023531, t = A014306.
 * @author Sean A. Irvine
 */
public class A024890 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024890() {
    super(2, new A023531(), new A014306(), false);
    next();
  }
}
