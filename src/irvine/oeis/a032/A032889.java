package irvine.oeis.a032;

/**
 * A032889 Numbers whose base-10 representation Sum_{i=0..m} d(i)*10^i has d(0) &lt; d(1) &gt; d(2) &lt; ...
 * @author Sean A. Irvine
 */
public class A032889 extends A032882 {

  @Override
  protected int base() {
    return 10;
  }
}
