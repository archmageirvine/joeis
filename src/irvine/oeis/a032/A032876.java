package irvine.oeis.a032;

/**
 * A032876 Numbers whose base-5 representation Sum_{i=0..m} d(i)*5^i has d(0) &gt; d(1) &lt; d(2) &gt; ...
 * @author Sean A. Irvine
 */
public class A032876 extends A032874 {

  @Override
  protected int base() {
    return 5;
  }
}
