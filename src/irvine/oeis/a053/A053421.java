package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a063.A063841;

/**
 * A053421 Number of 5-multigraphs on n nodes.
 * @author Sean A. Irvine
 */
public class A053421 extends A063841 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 5);
  }
}

