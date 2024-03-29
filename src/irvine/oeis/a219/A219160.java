package irvine.oeis.a219;
// Generated by gen_seq4.pl cordrectab/cordrec at 2022-07-14 22:55

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A219160 Recurrence equation a(n+1) = a(n)^3 - 3*a(n) with a(0) = 4.
 * <code>a(n)=a(n-1)^3-3*a(n-1)</code>
 * @author Georg Fischer
 */
public class A219160 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A219160() {
    super(0, 1, 0, 4);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).pow(3).subtract(Z.THREE.multiply(a(n - 1)));
  }
}
