package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001950;
import irvine.oeis.a014.A014306;

/**
 * A024691.
 * @author Sean A. Irvine
 */
public class A024691 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024691() {
    super(new PrependSequence(new A001950(), 0), new A014306());
  }
}
