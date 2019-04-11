package irvine.oeis.a005;

/**
 * A005983 Number of 4 up, 4 down, 4 up, <code>...</code> permutations of length <code>4n+1</code>.
 * @author Sean A. Irvine
 */
public class A005983 extends A005982 {

  @Override
  protected long start() {
    return -3;
  }

  @Override
  protected long size() {
    return 4;
  }
}
