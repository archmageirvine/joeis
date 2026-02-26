package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a057.A057123;
import irvine.oeis.a057.A057548;

/**
 * A083930 Map from binary trees of size n to the set of corresponding trivalent plane trees (tpt) represented as size 2n+1 general trees.
 * @author Sean A. Irvine
 */
public class A083930 extends A057123 {

  private final DirectSequence mA057548 = DirectSequence.create(new A057548());

  @Override
  public Z next() {
    final Z t = super.next();
    return t.isZero() ? t : mA057548.a(t);
  }
}
