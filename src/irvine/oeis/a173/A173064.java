package irvine.oeis.a173;
// manually A057934/parm2 at 2022-03-25 22:28

import irvine.oeis.a086.A086801;

/**
 * A173064 a(n) = prime(n) - 5.
 * @author Georg Fischer
 */
public class A173064 extends A086801 {

  /** Construct the sequence. */
  public A173064() {
    super(-5);
    next();
    next();
  }
}
