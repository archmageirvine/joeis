package irvine.oeis.a072;

import irvine.oeis.Combiner;
import irvine.oeis.a032.A032020;

/**
 * A072707 Number of non-unimodal compositions of n into distinct terms.
 * @author Sean A. Irvine
 */
public class A072707 extends Combiner {

  /** Construct the sequence. */
  public A072707() {
    super(0, new A032020(), new A072706(), SUBTRACT);
  }
}
