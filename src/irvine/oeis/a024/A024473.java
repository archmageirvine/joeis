package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a005.A005408;

/**
 * A024473.
 * @author Sean A. Irvine
 */
public class A024473 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024473() {
    super(new A000032(), new PrependSequence(new A005408(), 0));
  }
}
