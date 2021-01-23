package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a008.A008578;

/**
 * A024470 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k), where k = [ (n+1)/2 ], s = (Lucas numbers), t = (1, p(1), p(2), ...).
 * @author Sean A. Irvine
 */
public class A024470 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024470() {
    super(new A000032(), new PrependSequence(new A008578(), 0));
  }
}
