package irvine.oeis.a032;

/**
 * A032877 Numbers whose base-6 representation Sum_{i=0..m} d(i)*6^i has d(0) &gt; d(1) &lt; d(2) &gt; ...
 * @author Sean A. Irvine
 */
public class A032877 extends A032874 {

  @Override
  protected int base() {
    return 6;
  }
}
