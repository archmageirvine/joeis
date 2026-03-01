package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A083988 Primes p such that concatenation p, 0, R(p) is also a prime (of course a palindromic prime).
 * @author Sean A. Irvine
 */
public class A083988 extends FilterSequence {

  /** Construct the sequence. */
  public A083988() {
    super(1, new A000040(), k -> new Z(k + "0" + Functions.REVERSE.z(k)).isProbablePrime());
  }
}
