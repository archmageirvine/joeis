package irvine.oeis.a000;

/**
 * A000281 Expansion of cos(x)/cos(2x).
 * @author Sean A. Irvine
 */
public class A000281 extends A000233 {

  @Override
  protected int getA() {
    return 2;
  }

  @Override
  protected int getN() {
    return mT++;
  }
}
