package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061361 a(1) = 4; a(n) = least number such that the concatenation a(n)a(n-1)...a(2)a(1) is a square.
 * @author Sean A. Irvine
 */
public class A061361 extends A061359 {

  /** Construct the sequence. */
  public A061361() {
    super(Z.FOUR);
  }
}
