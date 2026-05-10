package irvine.oeis.a395;

import irvine.oeis.FilterSequence;
import irvine.oeis.a331.A331605;

/**
 * A395567 Primes of the form (x^2 + y^2 + z^2) / (x*y + x*z + y*z) with integer x, y, z.
 * @author Sean A. Irvine
 */
public class A395567 extends FilterSequence {

  /** Construct the sequence. */
  public A395567() {
    super(1, new A331605(), PRIME);
  }
}
