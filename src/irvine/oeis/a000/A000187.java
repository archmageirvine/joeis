package irvine.oeis.a000;

/**
 * A000187 Generalized Euler numbers, c(5,n).
 * @author Sean A. Irvine
 */
public class A000187 extends A000233 {

  @Override
  protected int getA() {
    return 5;
  }

  @Override
  protected int getN() {
    return mT++;
  }
}
