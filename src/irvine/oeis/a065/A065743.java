package irvine.oeis.a065;

import irvine.oeis.NestedSequence;
import irvine.oeis.a005.A005179;
import irvine.oeis.a025.A025475;

/**
 * A065743 Smallest number with exactly A025475(n) divisors.
 * @author Sean A. Irvine
 */
public class A065743 extends NestedSequence {

  /** Construct the sequence. */
  public A065743() {
    super(1, new A005179(), new A025475(), 1, 1);
  }
}
