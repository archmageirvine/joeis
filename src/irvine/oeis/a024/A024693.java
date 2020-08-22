package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a014.A014306;
import irvine.oeis.a023.A023533;

/**
 * A024693 s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k), where k = [ (n+1)/2 ], s = A023533, t = A014306.
 * @author Sean A. Irvine
 */
public class A024693 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024693() {
    super(new A023533(), new A014306());
  }
}
