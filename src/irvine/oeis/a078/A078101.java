package irvine.oeis.a078;

import irvine.math.z.Z;

/**
 * A078101 1/6 of the number of ways of 3-coloring an (n-1) X n grid.
 * @author Sean A. Irvine
 */
public class A078101 extends A078099 {

  private int mN = 1;

  /** Construct the sequence. */
  public A078101() {
    super(2);
  }

  @Override
  public Z next() {
    return t(mN++, mN).divide2();
  }
}

