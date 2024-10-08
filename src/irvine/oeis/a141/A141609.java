package irvine.oeis.a141;
// generated by patch_offset.pl at 2022-08-27 22:36

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A141609 a(n) = (a(n-1)*a(n-2) + a(n-1)^2)/a(n-3), with a(1) = a(2) = a(3) = 1.
 * @author Georg Fischer
 */
public class A141609 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A141609() {
    super(1, 3, 0, 1, 1, 1);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).multiply(a(n - 2)).add(a(n - 1).square()).divide(a(n - 3));
  }
}
