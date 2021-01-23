package irvine.oeis.a034;

import irvine.oeis.a020.A020775;
import irvine.oeis.a208.A208899;

/**
 * A034986 a(n)^2 is smallest square number starting with a string of n 5's.
 * @author Sean A. Irvine
 */
public class A034986 extends A034982 {

  /** Construct the sequence. */
  public A034986() {
    super(new A020775(), new A208899(), "5", "");
  }
}
