package irvine.oeis.a068;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;

/**
 * A068059 Partial sums of A068058 + 1.
 * @author Sean A. Irvine
 */
public class A068059 extends PartialSumSequence {

  /** Construct the sequence. */
  public A068059() {
    super(1, new PrependSequence(new A068058(), 1));
  }
}

