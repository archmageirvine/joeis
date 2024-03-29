package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005408;
import irvine.oeis.a014.A014306;

/**
 * A024602 s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k), where k = [ (n+1)/2 ], s = (odd natural numbers), t = A014306.
 * @author Sean A. Irvine
 */
public class A024602 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024602() {
    super(new PrependSequence(new A005408(), 0), new A014306());
  }
}
