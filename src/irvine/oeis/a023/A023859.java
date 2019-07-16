package irvine.oeis.a023;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a001.A001477;

/**
 * A023859.
 * @author Sean A. Irvine
 */
public class A023859 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A023859() {
    super(new A001477(), new A023532());
  }
}
