package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001434 Number of graphs with n nodes and n edges.
 * @author Sean A. Irvine
 */
public class A001434 extends A001430 {

  private int mM = -1;

  /** Construct the sequence. */
  public A001434() {
    super(0);
  }

  @Override
  public Z next() {
    return ++mM == 0 ? Z.ONE : numberLinearGraphs(mM, mM);
  }
}
