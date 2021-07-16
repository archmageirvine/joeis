package irvine.oeis.a048;

import irvine.oeis.RecordSequence;

/**
 * A048971 Let d(n) = number of distinct primes dividing n (A001221); sequence gives t such that d(t)=d(t+1)=...=d(t+n-1) is a run of record length.
 * @author Sean A. Irvine
 */
public class A048971 extends RecordSequence {

  /** Construct the sequence. */
  public A048971() {
    super(new A048932());
  }
}

