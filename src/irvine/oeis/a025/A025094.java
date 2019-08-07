package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a000.A000201;

/**
 * A025094.
 * @author Sean A. Irvine
 */
public class A025094 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025094() {
    super(new A000032(), new PrependSequence(new A000201(), 0), false);
    next();
  }
}
