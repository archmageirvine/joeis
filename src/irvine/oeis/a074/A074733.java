package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A074733 a(n+4) = floor( ( a(n) + 2*a(n+1) + 3*a(n+2) + 4*a(n+3) )/5 ), with a(0), a(1), a(2), a(3) equal to 0, 1, 2, 3.
 * @author Sean A. Irvine
 */
public class A074733 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A074733() {
    super(0, 4, 0, 0, 1, 2, 3);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 4).add(a(n - 3).multiply(2)).add(a(n - 2).multiply(3)).add(a(n - 1).multiply(4)).divide(5);
  }
}
