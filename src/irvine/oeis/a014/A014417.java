package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a003.A003714;

/**
 * A014417 Representation of n in base of Fibonacci numbers (the Zeckendorf representation of n). Also, binary words starting with 1 not containing 11, with the word 0 added.
 * @author Sean A. Irvine
 */
public class A014417 extends A003714 {

  @Override
  public Z next() {
    return new Z(super.next().toString(2));
  }
}
