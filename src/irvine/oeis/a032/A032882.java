package irvine.oeis.a032;

/**
 * A032882 Numbers whose base-3 representation Sum_{i=0..m} d(i)*3^i has d(0) &lt; d(1) &gt; d(2) &lt; ...
 * @author Sean A. Irvine
 */
public class A032882 extends A032874 {

  @Override
  protected int initialDirection() {
    return 1;
  }
}
