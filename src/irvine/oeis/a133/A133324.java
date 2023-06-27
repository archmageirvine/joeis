package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133324 7-gonal numbers which are sum of 2 consecutive 7-gonal numbers.
 * @author Sean A. Irvine
 */
public class A133324 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133324() {
    super(1, new long[] {1, -1, -1536796802, 1536796802, 1}, new long[] {1, 144841, 927821665, 222590743768705L, 1425873367156486249L});
  }
}
