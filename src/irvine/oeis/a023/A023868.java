package irvine.oeis.a023;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a001.A001477;

/**
 * A023868.
 * @author Sean A. Irvine
 */
public class A023868 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A023868() {
    super(new A001477(), new A023533());
  }
}
