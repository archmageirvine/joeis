package irvine.oeis.a032;

/**
 * A032872 Numbers n such that base 9 representation Sum{d(i)*9^i: i=0,1,...,m) has d(m)&gt;=d(m-1)&lt;=d(m-2)&gt;=...
 * @author Sean A. Irvine
 */
public class A032872 extends A032849 {

  @Override
  protected long base() {
    return 9;
  }

  @Override
  protected boolean initialDirection() {
    return false;
  }
}
