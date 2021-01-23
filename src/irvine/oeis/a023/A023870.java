package irvine.oeis.a023;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a001.A001477;
import irvine.oeis.a008.A008578;

/**
 * A023870 a(n) = 1*prime(n) + 2*prime(n-1) + ... + k*prime(n+1-k), where k=floor((n+1)/2) and prime(n) is the n-th prime.
 * @author Sean A. Irvine
 */
public class A023870 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A023870() {
    super(new A001477(), new A008578());
  }
}
