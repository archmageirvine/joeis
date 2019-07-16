package irvine.oeis.a023;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000201;
import irvine.oeis.a001.A001477;

/**
 * A023866.
 * @author Sean A. Irvine
 */
public class A023866 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A023866() {
    super(new A001477(), new PrependSequence(new A000201(), 0));
  }
}
