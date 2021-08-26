package irvine.oeis.a032;

/**
 * A032862 Numbers whose base-7 representation Sum_{i=0..m} d(i)*7^i has d(m) &gt; d(m-1) &lt; d(m-2) &gt; ...
 * @author Sean A. Irvine
 */
public class A032862 extends A032845 {

  @Override
  protected long start() {
    return 0;
  }

  @Override
  protected boolean initialDirection() {
    return false;
  }
}
