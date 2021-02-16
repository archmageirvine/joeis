package irvine.oeis.a032;

/**
 * A032881 Numbers whose base-10 representation Sum_{i=0..m} d(i)*10^i has d(0) &gt; d(1) &lt; d(2) &gt; ...
 * @author Sean A. Irvine
 */
public class A032881 extends A032874 {

  @Override
  protected int base() {
    return 10;
  }
}
