package irvine.oeis.a032;

/**
 * A032871 Numbers n such that base 8 representation Sum{d(i)*8^i: i=0,1,...,m) has d(m)&gt;=d(m-1)&lt;=d(m-2)&gt;=...
 * @author Sean A. Irvine
 */
public class A032871 extends A032849 {

  @Override
  protected long base() {
    return 8;
  }

  @Override
  protected boolean initialDirection() {
    return false;
  }
}
