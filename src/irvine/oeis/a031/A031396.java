package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a003.A003814;

/**
 * A031396 Numbers k such that Pell equation x^2 - k*y^2 = -1 is soluble.
 * @author Sean A. Irvine
 */
public class A031396 extends PrependSequence {

  /** Construct the sequence. */
  public A031396() {
    super(new A003814(), Z.ONE);
  }
}
