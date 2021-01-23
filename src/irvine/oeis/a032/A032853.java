package irvine.oeis.a032;

/**
 * A032853 Numbers n such that base 6 representation Sum{d(i)*6^i: i=0,1,...,m) has d(m)&lt;=d(m-1)&gt;=d(m-2)&lt;=...
 * @author Sean A. Irvine
 */
public class A032853 extends A032849 {

  @Override
  protected long base() {
    return 6;
  }
}
