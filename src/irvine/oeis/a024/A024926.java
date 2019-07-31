package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a038.A038605;

/**
 * A024926 <code>a(n) =</code> sum of <code>[ p(k)/k ], k = 1,2,3,...,n</code>.
 * @author Sean A. Irvine
 */
public class A024926 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024926() {
    super(new A038605());
  }
}
