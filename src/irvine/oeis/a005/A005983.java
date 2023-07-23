package irvine.oeis.a005;

/**
 * A005983 Number of 4 up, 4 down, 4 up, ... permutations of length 4n+1.
 * @author Sean A. Irvine
 */
public class A005983 extends A005982 {

  {
    setOffset(0);
  }

  @Override
  protected long start() {
    return -3;
  }

  @Override
  protected long size() {
    return 4;
  }
}
