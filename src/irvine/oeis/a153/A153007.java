package irvine.oeis.a153;

import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A153007 Triangular number A000217(n) minus toothpick number A153006(n).
 * @author Sean A. Irvine
 */
public class A153007 extends A153006 {

  private final A000217 mT = new A000217();

  @Override
  public Z next() {
    return mT.next().subtract(super.next());
  }
}

