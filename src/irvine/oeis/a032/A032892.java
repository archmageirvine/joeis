package irvine.oeis.a032;

/**
 * A032892 Numbers n such that base 4 representation <code>Sum{d(i)*4^i: i=0,1,...,m</code> has <code>d(0)&gt;=d(1)&lt;=d(2)&gt;=..</code>.
 * @author Sean A. Irvine
 */
public class A032892 extends A032890 {

  @Override
  protected int base() {
    return 4;
  }
}
