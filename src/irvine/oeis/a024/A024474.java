package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a000.A000201;

/**
 * A024474.
 * @author Sean A. Irvine
 */
public class A024474 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024474() {
    super(new A000032(), new PrependSequence(new A000201(), 0));
  }
}
