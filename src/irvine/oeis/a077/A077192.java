package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a069.A069871;

/**
 * A077192 {Concatenation of n-1 and n+1}/n where n is a member of A069871.
 * @author Sean A. Irvine
 */
public class A077192 extends A069871 {

  @Override
  public Z next() {
    final Z s = super.next();
    return new Z(s.subtract(1).toString() + s.add(1)).divide(s);
  }
}

