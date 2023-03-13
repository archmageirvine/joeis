package irvine.oeis.a061;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a060.A060985;

/**
 * A061883 Largest triangular number less than or equal to sum of previous terms with a(0)=1.
 * @author Sean A. Irvine
 */
public class A061883 extends DifferenceSequence {

  /** Construct the sequence. */
  public A061883() {
    super(new PrependSequence(new A060985(), 0));
  }
}
