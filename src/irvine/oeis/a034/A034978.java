package irvine.oeis.a034;

import irvine.oeis.SkipSequence;
import irvine.oeis.a020.A020847;
import irvine.oeis.a122.A122553;

/**
 * A034978 a(n)^2 is smallest square starting with a string of n 1's.
 * @author Sean A. Irvine
 */
public class A034978 extends A034982 {

  /** Construct the sequence. */
  public A034978() {
    super(new SkipSequence(new A122553(), 1), new A020847(), "1", "");
  }
}
