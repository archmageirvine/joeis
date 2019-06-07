package irvine.oeis.a176;

import irvine.math.z.Z;

/**
 * A176767 Smallest power of 7 whose decimal expansion contains <code>n</code>.
 * @author Sean A. Irvine
 */
public class A176767 extends A176772 {

  /** Default constructor. */
  public A176767() {
    super(-1);
  }

  @Override
  protected Z base() {
    return Z.SEVEN;
  }
}

