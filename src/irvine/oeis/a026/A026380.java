package irvine.oeis.a026;

import irvine.oeis.AlternatingSequence;
import irvine.oeis.SkipSequence;

/**
 * A026380 a(n) = T(n,[ n/2 ]), where T is the array in A026374.
 * @author Sean A. Irvine
 */
public class A026380 extends AlternatingSequence {

  /** Construct the sequence. */
  public A026380() {
    super(new A026378(), new SkipSequence(new A026375(), 1));
  }
}
