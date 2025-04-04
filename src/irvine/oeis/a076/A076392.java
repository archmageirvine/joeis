package irvine.oeis.a076;

import irvine.oeis.RecordSequence;

/**
 * A076392 Increasing partial quotients of the continued fraction for agm(1,i)/(1+i).
 * @author Sean A. Irvine
 */
public class A076392 extends RecordSequence {

  /** Construct the sequence. */
  public A076392() {
    super(new A076391());
  }
}
