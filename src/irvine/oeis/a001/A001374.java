package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a004.A004105;

/**
 * A001374 Number of relational systems on n nodes. Also number of directed 3-multigraphs with loops on n nodes.
 * @author Sean A. Irvine
 */
public class A001374 extends A004105 {

  {
    super.next();
  }

  @Override
  protected Z base() {
    return Z.FOUR;
  }
}

