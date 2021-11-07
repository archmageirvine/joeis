package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a008.A008441;

/**
 * A052343 Number of ways to write n as the unordered sum of two triangular numbers (zero allowed).
 * @author Sean A. Irvine
 */
public class A052343 extends A008441 {

  @Override
  public Z next() {
    return super.next().add(1).divide2();
  }
}
