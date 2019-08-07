package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a014.A014306;

/**
 * A025097.
 * @author Sean A. Irvine
 */
public class A025097 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025097() {
    super(new A000032(), new A014306(), false);
    next();
  }
}
