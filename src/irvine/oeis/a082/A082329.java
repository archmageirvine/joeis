package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A082329 Permutation of positive natural numbers: a(n) = A082327(n-1)+1.
 * @author Sean A. Irvine
 */
public class A082329 extends Sequence1 {

  private final Sequence mA = new A082327();

  @Override
  public Z next() {
    return mA.next().add(1);
  }
}
