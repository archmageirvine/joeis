package irvine.oeis.a078;

import irvine.math.z.Z;

/**
 * A078102 1/6 of the number of ways of 3-coloring an (n-2) X n grid.
 * @author Sean A. Irvine
 */
public class A078102 extends A078099 {

  private int mN = 2;

  /** Construct the sequence. */
  public A078102() {
    super(3);
  }

  @Override
  public Z next() {
    return t(++mN - 2, mN).divide2();
  }
}

