package irvine.oeis.a032;

/**
 * A032863 Numbers whose base-8 representation Sum_{i=0..m} d(i)*8^i has d(m) &gt; d(m-1) &lt; d(m-2) &gt; ...
 * @author Sean A. Irvine
 */
public class A032863 extends A032846 {

  @Override
  protected long start() {
    return 0;
  }

  @Override
  protected boolean initialDirection() {
    return false;
  }
}
