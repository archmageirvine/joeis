package irvine.oeis.a032;

/**
 * A032859 Numbers k such that base 4 representation Sum_{i=0..m} d(i)*4^i has d(m)&gt;d(m-1)&lt;d(m-2)&gt;...
 * @author Sean A. Irvine
 */
public class A032859 extends A032842 {

  @Override
  protected boolean initialDirection() {
    return false;
  }
}
