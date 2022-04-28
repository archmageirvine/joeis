package irvine.oeis.a134;
// manually deris/essent at 2022-04-28 12:39

import irvine.oeis.PrependSequence;
import irvine.oeis.a046.A046346;

/**
 * A134330 Nonprime numbers which are divisible by the sum of their prime factors (counted with multiplicity).
 * @author Georg Fischer
 */
public class A134330 extends PrependSequence {

  /** Construct the sequence. */
  public A134330() {
    super(new A046346(), 1);
  }
}
