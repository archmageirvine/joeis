package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.NoncomputableSequence;

/**
 * A077747 Partition the digits of the concatenation 123456789101112131415... of natural numbers such that a(n) contains a(n-1) digits with a(1) = 1.
 * @author Sean A. Irvine
 */
public class A077747 extends NoncomputableSequence {

  /** Construct the sequence. */
  public A077747() {
    // Next term is too large to represent
    super(1, NONCOMPUTABLE, Z.ONE, Z.TWO, Z.valueOf(34), new Z("5678910111213141516171819202122232"));
  }
}
