package irvine.oeis.a032;

/**
 * A032847 Numbers whose base-9 representation Sum_{i=0..m} d(i)*9^i has d(m) &lt; d(m-1) &gt; d(m-2) &lt; ...
 * @author Sean A. Irvine
 */
public class A032847 extends A032841 {

  @Override
  protected long base() {
    return 9;
  }
}
