package irvine.oeis.a061;

import irvine.oeis.NestedSequence;
import irvine.oeis.a002.A002191;
import irvine.oeis.a005.A005179;

/**
 * A061072 Smallest integer with A002191(n) divisors, i.e., the number of divisors equals the sum of the divisors of a different number.
 * @author Sean A. Irvine
 */
public class A061072 extends NestedSequence {

  /** Construct the sequence. */
  public A061072() {
    super(1, new A005179(), new A002191(), 1, 1);
  }
}
