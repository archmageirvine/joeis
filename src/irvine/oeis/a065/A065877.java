package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a005.A005349;

/**
 * A065877 Non-Niven (or non-Harshad) numbers: numbers which are not a multiple of the sum of their digits.
 * @author Sean A. Irvine
 */
public class A065877 extends ComplementSequence {

  /** Construct the sequence. */
  public A065877() {
    super(1, new A005349(), Z.ONE);
  }
}

