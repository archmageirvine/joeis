package irvine.oeis.a023;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a001.A001477;
import irvine.oeis.a014.A014306;

/**
 * A023869 a(n) = 1*t(n) + 2*t(n-1) + ... + k*t(n+1-k), where k=floor((n+1)/2) and t is A014306.
 * @author Sean A. Irvine
 */
public class A023869 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A023869() {
    super(new A001477(), new A014306());
  }
}
