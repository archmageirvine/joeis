package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a002.A002808;

/**
 * A024461 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k), where k = [ (n+1)/2 ], s = (Fibonacci numbers), t = (composite numbers).
 * @author Sean A. Irvine
 */
public class A024461 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024461() {
    super(new A000045(), new PrependSequence(new A002808(), 0));
  }
}
