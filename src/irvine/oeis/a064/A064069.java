package irvine.oeis.a064;

import irvine.oeis.a000.A000233;

/**
 * A064069 Generalized Euler number c(8,n).
 * @author Sean A. Irvine
 */
public class A064069 extends A000233 {

  /** Construct the sequence. */
  public A064069() {
    super(0);
  }

  @Override
  protected int getA() {
    return 8;
  }

  @Override
  protected int getN() {
    return mT++;
  }
}
