package irvine.oeis.a023;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a001.A001477;

/**
 * A023859 a(n) = 1*t(n) + 2*t(n-1) + ... + k*t(n+1-k), where k=floor((n+1)/2), and t = A023532.
 * @author Sean A. Irvine
 */
public class A023859 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A023859() {
    super(new A001477(), new A023532());
  }
}
