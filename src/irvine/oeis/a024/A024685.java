package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000201;

/**
 * A024685.
 * @author Sean A. Irvine
 */
public class A024685 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024685() {
    super(new PrependSequence(new A000201(), 0));
  }
}
