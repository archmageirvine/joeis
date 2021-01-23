package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a008.A008578;
import irvine.oeis.a014.A014306;

/**
 * A024696 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k), where k = [ (n+1)/2 ], s = A014306, t = (primes).
 * @author Sean A. Irvine
 */
public class A024696 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024696() {
    super(new A014306(), new A008578());
  }
}
