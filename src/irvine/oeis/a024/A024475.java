package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a001.A001950;

/**
 * A024475.
 * @author Sean A. Irvine
 */
public class A024475 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024475() {
    super(new A000032(), new PrependSequence(new A001950(), 0));
  }
}
