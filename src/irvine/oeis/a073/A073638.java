package irvine.oeis.a073;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a066.A066272;

/**
 * A073638 Number of anti-divisors of n (A066272) sets a record.
 * @author Sean A. Irvine
 */
public class A073638 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A073638() {
    super(1, new A066272(), 1);
  }
}
