package irvine.oeis.a085;

import irvine.oeis.RecordSequence;

/**
 * A085827 Increasing partial quotients of number defined in A085825 and A085826.
 * @author Sean A. Irvine
 */
public class A085827 extends RecordSequence {

  /** Construct the sequence. */
  public A085827() {
    super(1, new A085826());
  }
}
