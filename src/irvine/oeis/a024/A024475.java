package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a001.A001950;

/**
 * A024475 s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k), where k = [ (n+1)/2 ], s = (Lucas numbers), t = A001950 (upper Wythoff sequence).
 * @author Sean A. Irvine
 */
public class A024475 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024475() {
    super(new A000032(), new PrependSequence(new A001950(), 0));
  }
}
