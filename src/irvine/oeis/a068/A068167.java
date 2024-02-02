package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068167 Define an increasing sequence as follows. Given the first term, called the seed (which need not share the property of the remaining terms), subsequent terms are obtained by inserting at least one digit in the previous term so as to obtain the smallest number with the specified property. This is the prime sequence with the seed a(1) = 2.
 * @author Sean A. Irvine
 */
public class A068167 extends A068166 {

  /** Construct the sequence. */
  public A068167() {
    super(Z.TWO);
  }
}
