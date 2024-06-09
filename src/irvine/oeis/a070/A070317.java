package irvine.oeis.a070;

import irvine.oeis.RecordSequence;
import irvine.oeis.a053.A053000;

/**
 * A070287.
 * @author Sean A. Irvine
 */
public class A070317 extends RecordSequence {

  /** Construct the sequence. */
  public A070317() {
    super(1, new A053000().skip());
  }
}
