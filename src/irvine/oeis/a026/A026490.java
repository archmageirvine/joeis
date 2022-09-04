package irvine.oeis.a026;

import irvine.oeis.base.RunLengthSequence;

/**
 * A026490 Length of n-th run of identical symbols in A026465.
 * @author Sean A. Irvine
 */
public class A026490 extends RunLengthSequence {

  /** Construct the sequence. */
  public A026490() {
    super(new A026465());
  }
}
