package irvine.oeis.a000;

/**
 * A000191 Generalized tangent numbers d(3,n).
 * @author Sean A. Irvine
 */
public class A000191 extends A000061 {

  @Override
  protected int getA() {
    return 3;
  }

  @Override
  protected int getN() {
    return ++mT;
  }
}
