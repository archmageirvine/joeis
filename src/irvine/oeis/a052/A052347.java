package irvine.oeis.a052;

import irvine.oeis.RecordSequence;

/**
 * A052347 Record values reached in A052343 and A052344.
 * @author Sean A. Irvine
 */
public class A052347 extends RecordSequence {

  /** Construct the sequence. */
  public A052347() {
    super(new A052344().skip(2));
  }
}
