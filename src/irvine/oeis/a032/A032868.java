package irvine.oeis.a032;

/**
 * A032868 Numbers n such that base 5 representation Sum{d(i)*5^i: i=0,1,...,m) has d(m)&gt;=d(m-1)&lt;=d(m-2)&gt;=...
 * @author Sean A. Irvine
 */
public class A032868 extends A032849 {

  @Override
  protected long base() {
    return 5;
  }

  @Override
  protected boolean initialDirection() {
    return false;
  }
}
