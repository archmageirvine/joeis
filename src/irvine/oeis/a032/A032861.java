package irvine.oeis.a032;

/**
 * A032861 Numbers k such that base 6 representation Sum_{i=0..m} d(i)*6^i has d(m)&gt;d(m-1)&lt;d(m-2)&gt;...
 * @author Sean A. Irvine
 */
public class A032861 extends A032844 {

  @Override
  protected long start() {
    return 0;
  }

  @Override
  protected boolean initialDirection() {
    return false;
  }
}
