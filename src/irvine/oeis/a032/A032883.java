package irvine.oeis.a032;

/**
 * A032883 Numbers whose base-4 representation Sum_{i=0..m} d(i)*4^i has d(0) &lt; d(1) &gt; d(2) &lt; ...
 * @author Sean A. Irvine
 */
public class A032883 extends A032882 {

  @Override
  protected int base() {
    return 4;
  }
}
