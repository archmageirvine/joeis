package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002808;
import irvine.oeis.a008.A008578;

/**
 * A024604 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s =</code> (composite numbers), <code>t =</code> (primes).
 * @author Sean A. Irvine
 */
public class A024604 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024604() {
    super(new PrependSequence(new A002808(), 0), new A008578());
  }
}
