package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a001.A001477;

/**
 * A024858 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = (natural numbers), t = (Lucas numbers).
 * @author Sean A. Irvine
 */
public class A024858 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024858() {
    super(2, new A001477(), new A000032(), false);
    next();
  }
}
