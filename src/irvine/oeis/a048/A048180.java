package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a001.A001430;

/**
 * A048180 Number of graphs with n nodes and n+2 edges.
 * @author Sean A. Irvine
 */
public class A048180 extends A001430 {

  /** Construct the sequence. */
  public A048180() {
    super(4);
  }

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return numberLinearGraphs(++mN, mN + 2);
  }
}
