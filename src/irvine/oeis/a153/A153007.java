package irvine.oeis.a153;

import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A153007 Triangular number <code>A000217(n)</code> minus toothpick number <code>A153006(n)</code>.
 * @author Sean A. Irvine
 */
public class A153007 extends A153006 {

  private final A000217 mT = new A000217();

  @Override
  public Z next() {
    return mT.next().subtract(super.next());
  }
}

