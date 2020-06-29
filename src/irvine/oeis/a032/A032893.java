package irvine.oeis.a032;

/**
 * A032893 Numbers n such that base 5 representation <code>Sum{d(i)*5^i: i=0,1,...,m</code> has <code>d(0)&gt;=d(1)&lt;=d(2)&gt;=..</code>.
 * @author Sean A. Irvine
 */
public class A032893 extends A032890 {

  @Override
  protected int base() {
    return 5;
  }
}
