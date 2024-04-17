package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a001.A001044;

/**
 * A048858 Number of prime factors of 1+(n!)^2 (with multiplicity).
 * @author Sean A. Irvine
 */
public class A048858 extends A001044 {

  @Override
  public Z next() {
    return Functions.BIG_OMEGA.z(super.next().add(1));
  }
}

