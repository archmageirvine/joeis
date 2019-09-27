package irvine.oeis.a026;

import irvine.oeis.AlternatingSequence;
import irvine.oeis.SkipSequence;

/**
 * A026380 <code>a(n) = T(n,[ n/2 ])</code>, where T is the array in <code>A026374</code>.
 * @author Sean A. Irvine
 */
public class A026380 extends AlternatingSequence {

  /** Construct the sequence. */
  public A026380() {
    super(new A026378(), new SkipSequence(new A026375(), 1));
  }
}
