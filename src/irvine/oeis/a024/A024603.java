package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005408;
import irvine.oeis.a008.A008578;

/**
 * A024603 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k), where k = [ (n+1)/2 ], s = (odd natural numbers), t = (primes).
 * @author Sean A. Irvine
 */
public class A024603 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024603() {
    super(new PrependSequence(new A005408(), 0), new A008578());
  }
}
