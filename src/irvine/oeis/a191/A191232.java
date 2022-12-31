package irvine.oeis.a191;
// manually concatf/concats at 2022-12-30 17:50

import irvine.oeis.a004.A004676;
import irvine.oeis.a176.A176178;

/**
 * A191232 Concatenation of primes written in base 2 (A004676).
 * @author Georg Fischer
 */
public class A191232 extends A176178 {

  /** Construct the sequence. */
  public A191232() {
    super(1, new A004676(), 10);
  }
}
