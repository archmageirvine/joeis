package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a006.A006472;

/**
 * A061213 a(n) = product of first n triangular numbers (A000217) + 1.
 * @author Sean A. Irvine
 */
public class A061213 extends A006472 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
