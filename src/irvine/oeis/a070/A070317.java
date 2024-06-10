package irvine.oeis.a070;

import irvine.oeis.RecordSequence;
import irvine.oeis.a053.A053000;

/**
 * A070317 Record values of nextprime(n^2)-n^2, cf. A070316.
 * @author Sean A. Irvine
 */
public class A070317 extends RecordSequence {

  /** Construct the sequence. */
  public A070317() {
    super(1, new A053000().skip());
  }
}
