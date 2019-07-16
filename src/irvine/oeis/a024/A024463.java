package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a005.A005408;

/**
 * A024463.
 * @author Sean A. Irvine
 */
public class A024463 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024463() {
    super(new A000045(), new PrependSequence(new A005408(), 0));
  }
}
