package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000201;
import irvine.oeis.a001.A001950;

/**
 * A024686.
 * @author Sean A. Irvine
 */
public class A024686 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024686() {
    super(new PrependSequence(new A000201(), 0), new PrependSequence(new A001950(), 0));
  }
}
