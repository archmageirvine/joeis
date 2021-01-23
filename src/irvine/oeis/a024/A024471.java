package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a002.A002808;

/**
 * A024471 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k), where k = [ (n+1)/2 ], s = (Lucas numbers), t = (composite numbers).
 * @author Sean A. Irvine
 */
public class A024471 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024471() {
    super(new A000032(), new PrependSequence(new A002808(), 0));
  }
}
