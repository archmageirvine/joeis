package irvine.oeis.a053;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000716;
import irvine.oeis.a004.A004016;

/**
 * A053762 Number of 3-colored generalized Frobenius partitions of n.
 * @author Sean A. Irvine
 */
public class A053762 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A053762() {
    super(new A000716(), new A004016());
  }
}
