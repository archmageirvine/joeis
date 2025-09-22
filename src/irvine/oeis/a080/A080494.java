package irvine.oeis.a080;

import irvine.math.z.Z;

/**
 * A080494 a(1) =9, a(n) = smallest multiple of a(n-1) (not equal to 10^k*a(n-1)) obtained by inserting digits anywhere in a(n-1).
 * @author Sean A. Irvine
 */
public class A080494 extends A080486 {

  /** Construct the sequence. */
  public A080494() {
    super(Z.NINE);
  }
}

