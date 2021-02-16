package irvine.oeis.a032;

/**
 * A032842 Numbers whose base-4 representation Sum_{i=0..m} d(i)*4^i has d(m) &lt; d(m-1) &gt; d(m-2) &lt; ...
 * @author Sean A. Irvine
 */
public class A032842 extends A032841 {

  @Override
  protected long base() {
    return 4;
  }
}
