package irvine.oeis.a115;
// manually recval/recpos at 2023-09-10 18:27

import irvine.oeis.RecordSequence;
import irvine.oeis.a031.A031165;

/**
 * A115401 Record differences between prime(n+3) and prime(n). Records in A031165.
 * @author Georg Fischer
 */
public class A115401 extends RecordSequence {

  /** Construct the sequence. */
  public A115401() {
    super(1, new A031165());
  }
}
