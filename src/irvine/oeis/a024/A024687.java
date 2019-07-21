package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000201;
import irvine.oeis.a023.A023533;

/**
 * A024687.
 * @author Sean A. Irvine
 */
public class A024687 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024687() {
    super(new PrependSequence(new A000201(), 0), new A023533());
  }
}
