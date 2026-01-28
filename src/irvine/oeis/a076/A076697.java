package irvine.oeis.a076;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a079.A079451;

/**
 * A076697 Indices of record values in A079451, largest prime factor of Lucas numbers A000032.
 * @author Sean A. Irvine
 */
public class A076697 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A076697() {
    super(0, 0, new A079451());
  }
}
