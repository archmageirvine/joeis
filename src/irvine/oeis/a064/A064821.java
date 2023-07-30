package irvine.oeis.a064;

import irvine.oeis.PrependSequence;
import irvine.oeis.a051.A051239;

/**
 * A064821 Number of ways of writing the numbers 1 .. n in a sequence so that the sum of any two adjacent numbers is a prime; reversing the sequence does not count as different.
 * @author Sean A. Irvine
 */
public class A064821 extends PrependSequence {

  /** Construct the sequence. */
  public A064821() {
    super(1, new A051239().skip(), 0);
  }
}
