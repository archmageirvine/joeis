package irvine.oeis.a111;

import irvine.math.z.Z;
import irvine.oeis.a069.A069603;

/**
 * A111525 a(1) = 10; a(n) = smallest number such that the juxtaposition a(1)a(2)...a(n) is a prime.
 * @author Sean A. Irvine
 */
public class A111525 extends A069603 {

  /** Construct the sequence. */
  public A111525() {
    super(Z.TEN);
  }
}
