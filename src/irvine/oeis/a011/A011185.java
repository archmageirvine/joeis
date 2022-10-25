package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.a010.A010672;

/**
 * A011185 A B_2 sequence: a(n) = least value such that sequence increases and pairwise sums of distinct elements are all distinct.
 * @author Sean A. Irvine
 */
public class A011185 extends A010672 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
