package irvine.oeis.a064;

import irvine.oeis.a000.A000233;

/**
 * A064071 Generalized Euler number c(10,n).
 * @author Sean A. Irvine
 */
public class A064071 extends A000233 {

  /** Construct the sequence. */
  public A064071() {
    super(0);
  }

  @Override
  protected int getA() {
    return 10;
  }

  @Override
  protected int getN() {
    return mT++;
  }
}
