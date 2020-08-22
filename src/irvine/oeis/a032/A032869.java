package irvine.oeis.a032;

/**
 * A032869 Numbers n such that base 6 representation Sum{d(i)*6^i: i=0,1,...,m) has d(m)&gt;=d(m-1)&lt;=d(m-2)&gt;=...
 * @author Sean A. Irvine
 */
public class A032869 extends A032849 {

  @Override
  protected long base() {
    return 6;
  }

  @Override
  protected boolean initialDirection() {
    return false;
  }
}
