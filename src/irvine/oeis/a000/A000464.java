package irvine.oeis.a000;

/**
 * A000464 Expansion of sin <code>x /cos 2x</code>.
 * @author Sean A. Irvine
 */
public class A000464 extends A000061 {

  @Override
  protected int getA() {
    return 2;
  }

  @Override
  protected int getN() {
    return ++mT;
  }
}
