package irvine.oeis.a032;

/**
 * A032854 Numbers n such that base 7 representation Sum{d(i)*7^i: i=0,1,...,m) has d(m)&lt;=d(m-1)&gt;=d(m-2)&lt;=...
 * @author Sean A. Irvine
 */
public class A032854 extends A032849 {

  @Override
  protected long base() {
    return 7;
  }
}
