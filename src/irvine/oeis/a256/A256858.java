package irvine.oeis.a256;
// manually cordrec at 2022-06-09 19:34

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A256858 a(n) = (-a(n-1) * a(n-6) + a(n-2) * a(n-5)) / a(n-7) with a(n) = 1 if abs(n) &lt; 4, a(11) = 4.
 * <code>0 = a(n) * a(n+11) + a(n+1) * a(n+10) + a(n+5) * a(n+6) for all n in Z</code>
 * @author Georg Fischer
 */
public class A256858 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A256858() {
    super(0, 11, 11, "1, 1, 1, 1, 0, 1,-1, 2,-3, 3,-3, 4,-2, 8, 9, 17, 29");
  }

  @Override
  protected Z compute(final int n) {
    return a(n + 1).multiply(a(n + 10)).add(a(n + 5).multiply(a(n + 6))).negate().divide(a(n));
  }
}
