package irvine.oeis.a080;

import irvine.math.z.Z;

/**
 * A080488 a(1) =3, a(n) = smallest multiple of a(n-1) (not equal to 10^k*a(n-1)) obtained by inserting digits anywhere in a(n-1).
 * @author Sean A. Irvine
 */
public class A080488 extends A080486 {

  /** Construct the sequence. */
  public A080488() {
    super(Z.THREE);
  }
}

