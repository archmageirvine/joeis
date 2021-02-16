package irvine.oeis.a032;

/**
 * A032879 Numbers whose that base-8 representation Sum_{i=0..m} d(i)*8^i has d(0) &gt; d(1) &lt; d(2) &gt; ...
 * @author Sean A. Irvine
 */
public class A032879 extends A032874 {

  @Override
  protected int base() {
    return 8;
  }
}
