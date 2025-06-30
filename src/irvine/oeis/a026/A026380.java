package irvine.oeis.a026;

import irvine.oeis.InterleaveSequence;

/**
 * A026380 a(n) = T(n,[ n/2 ]), where T is the array in A026374.
 * @author Sean A. Irvine
 */
public class A026380 extends InterleaveSequence {

  /** Construct the sequence. */
  public A026380() {
    super(0, new A026378(), new A026375().skip(1));
  }
}
