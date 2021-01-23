package irvine.oeis.a032;

/**
 * A032858 Numbers whose base-3 representation Sum_{i=0..m} d(i)*3^i has d(m) &gt; d(m-1) &lt; d(m-2) &gt; ...
 * @author Sean A. Irvine
 */
public class A032858 extends A032841 {

  @Override
  protected long start() {
    return 0;
  }

  @Override
  protected boolean initialDirection() {
    return false;
  }
}
