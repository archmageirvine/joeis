package irvine.oeis.a006;

/**
 * A006700.
 * @author Sean A. Irvine
 */
public class A006700 extends A006698 {

  @Override
  protected long start() {
    return super.start() + 1;
  }

  @Override
  protected long m() {
    return 3;
  }
}
