package irvine.oeis.a032;

/**
 * A032864 Numbers k such that base 9 representation Sum_{i=0..m} d(i)*9^i has d(m) &gt; d(m-1) &lt; d(m-2) &gt; ...
 * @author Sean A. Irvine
 */
public class A032864 extends A032847 {

  @Override
  protected long start() {
    return 0;
  }

  @Override
  protected boolean initialDirection() {
    return false;
  }
}
