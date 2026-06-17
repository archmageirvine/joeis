package irvine.oeis.a359;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a001.A001694;
import irvine.oeis.a072.A072777;

/**
 * A359280 Powerful numbers that are neither prime powers nor powers of squarefree composites.
 * @author Sean A. Irvine
 */
public class A359280 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A359280() {
    super(1, new A001694().skip(), new A072777());
  }
}
