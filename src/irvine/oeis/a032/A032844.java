package irvine.oeis.a032;

/**
 * A032844 Numbers whose base-6 representation Sum_{i=0..m} d(i)*6^i has d(m) &lt; d(m-1) &gt; d(m-2) &lt; ...
 * @author Sean A. Irvine
 */
public class A032844 extends A032841 {

  @Override
  protected long base() {
    return 6;
  }
}
