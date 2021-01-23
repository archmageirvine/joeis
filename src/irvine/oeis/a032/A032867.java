package irvine.oeis.a032;

/**
 * A032867 Numbers n such that base 4 representation Sum{d(i)*4^i: i=0,1,...,m) has d(m)&gt;=d(m-1)&lt;=d(m-2)&gt;=...
 * @author Sean A. Irvine
 */
public class A032867 extends A032849 {

  @Override
  protected long base() {
    return 4;
  }

  @Override
  protected boolean initialDirection() {
    return false;
  }
}
