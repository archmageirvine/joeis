package irvine.oeis.a032;

/**
 * A032884 Numbers whose base-5 representation Sum_{i=0..m} d(i)*5^i has d(0) &lt; d(1) &gt; d(2) &lt; ...
 * @author Sean A. Irvine
 */
public class A032884 extends A032882 {

  @Override
  protected int base() {
    return 5;
  }
}
