package irvine.oeis.a074;

import irvine.oeis.RecordSequence;
import irvine.oeis.a075.A075242;

/**
 * A074901 Increasingly larger bases required for composite numbers to become prime by base reversal (A075243).
 * @author Sean A. Irvine
 */
public class A074901 extends RecordSequence {

  /** Construct the sequence. */
  public A074901() {
    super(1, new A075242());
  }
}
