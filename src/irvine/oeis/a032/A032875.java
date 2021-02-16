package irvine.oeis.a032;

/**
 * A032875 Numbers whose base-4 representation Sum_{i=0..m} d(i)*4^i has d(0) &gt; d(1) &lt; d(2) &gt; ...
 * @author Sean A. Irvine
 */
public class A032875 extends A032874 {

  @Override
  protected int base() {
    return 4;
  }
}
