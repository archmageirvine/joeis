package irvine.oeis.a032;

/**
 * A032866 Numbers n such that base 3 representation Sum{d(i)*3^i: i=0,1,...,m) has d(m)&gt;=d(m-1)&lt;=d(m-2)&gt;=...
 * @author Sean A. Irvine
 */
public class A032866 extends A032849 {

  @Override
  protected long base() {
    return 3;
  }

  @Override
  protected boolean initialDirection() {
    return false;
  }
}
