package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001950;
import irvine.oeis.a023.A023531;

/**
 * A024325 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k), where k=[ (n+1)/2) ], s = A023531, t = A001950 (upper Wythoff sequence).
 * @author Sean A. Irvine
 */
public class A024325 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024325() {
    super(new A023531(), new PrependSequence(new A001950(), 0));
  }
}
