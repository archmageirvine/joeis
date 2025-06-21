package irvine.oeis.a096;

import irvine.math.function.Functions;
import irvine.oeis.a002.A002275;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A096497 Prime following n-th repunit.
 * @author Sean A. Irvine
 */
public class A096497 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A096497() {
    super(1, new A002275().skip(), Functions.NEXT_PRIME::z);
  }
}

