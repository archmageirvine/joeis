package irvine.oeis.a032;

/**
 * A032860 Numbers whose base-5 representation Sum_{i=0..m} d(i)*5^i has d(m) &gt; d(m-1) &lt; d(m-2) &gt; ...
 * @author Sean A. Irvine
 */
public class A032860 extends A032843 {

  @Override
  protected long start() {
    return 0;
  }

  @Override
  protected boolean initialDirection() {
    return false;
  }
}
