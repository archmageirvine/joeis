package irvine.oeis.a005;

/**
 * A005981.
 * @author Sean A. Irvine
 */
public class A005981 extends A005982 {

  @Override
  protected long start() {
    return 1 - size();
  }

  @Override
  protected long size() {
    return 2;
  }
}
