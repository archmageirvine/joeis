package irvine.oeis.a032;

/**
 * A032852 Numbers n such that base 5 representation <code>Sum{d(i)*5^i: i=0,1,...,m)</code> has <code>d(m)&lt;=d(m-1)&gt;=d(m-2)&lt;=..</code>.
 * @author Sean A. Irvine
 */
public class A032852 extends A032849 {

  @Override
  protected long base() {
    return 5;
  }
}
