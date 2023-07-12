package irvine.oeis.a185;
// manually simple3 at 2023-03-24

import irvine.oeis.NoncomputableSequence;

/**
 * A185182 a(n) = 2^n*A185181(n).
 * @author Georg Fischer
 */
public class A185182 extends NoncomputableSequence {

  /** Construct the sequence. */
  public A185182() {
    super(0, 2, 4, 56, 1056, 25152, 728192, 24242048);
  }

}
