package irvine.oeis.a064;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a040.A040076;

/**
 * A064699 Integers for which the smallest m in A040076 such that n*2^m+1 is prime (A050921) increases.
 * @author Sean A. Irvine
 */
public class A064699 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A064699() {
    super(new A040076(), 1);
  }
}
