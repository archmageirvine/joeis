package irvine.oeis.a076;

import irvine.oeis.RecordSequence;
import irvine.oeis.a039.A039993;

/**
 * A076497 Number of primes corresponding to n-th primeval number A072857(n).
 * @author Sean A. Irvine
 */
public class A076497 extends RecordSequence {

  /** Construct the sequence. */
  public A076497() {
    super(0, new A039993());
  }
}

