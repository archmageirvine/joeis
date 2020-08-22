package irvine.oeis.a000;

/**
 * A000411 Generalized tangent numbers d(6,n).
 * @author Sean A. Irvine
 */
public class A000411 extends A000061 {

  @Override
  protected int getA() {
    return 6;
  }

  @Override
  protected int getN() {
    return ++mT;
  }
}
