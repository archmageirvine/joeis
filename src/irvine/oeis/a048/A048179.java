package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a001.A001430;

/**
 * A048179 Number of graphs with n nodes and n+1 edges.
 * @author Sean A. Irvine
 */
public class A048179 extends A001430 {

  /** Construct the sequence. */
  public A048179() {
    super(4);
  }

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return numberLinearGraphs(++mN, mN + 1);
  }
}
