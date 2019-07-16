package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a014.A014306;

/**
 * A024477.
 * @author Sean A. Irvine
 */
public class A024477 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024477() {
    super(new A000032(), new A014306());
  }
}
