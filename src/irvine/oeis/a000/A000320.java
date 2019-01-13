package irvine.oeis.a000;

/**
 * A000320.
 * @author Sean A. Irvine
 */
public class A000320 extends A000061 {

  @Override
  protected int getA() {
    return 5;
  }

  @Override
  protected int getN() {
    return ++mT;
  }
}
