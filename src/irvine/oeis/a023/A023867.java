package irvine.oeis.a023;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001477;
import irvine.oeis.a001.A001950;

/**
 * A023867.
 * @author Sean A. Irvine
 */
public class A023867 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A023867() {
    super(new A001477(), new PrependSequence(new A001950(), 0));
  }
}
