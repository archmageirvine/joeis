package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a002.A002808;

/**
 * A024471.
 * @author Sean A. Irvine
 */
public class A024471 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024471() {
    super(new A000032(), new PrependSequence(new A002808(), 0));
  }
}
