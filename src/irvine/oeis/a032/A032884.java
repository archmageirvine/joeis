package irvine.oeis.a032;

/**
 * A032884 Numbers n such that base 5 representation <code>Sum{d(i)*5^i: i=0,1,...,m)</code> has <code>d(0)&lt;d(1)&gt;d(2)&lt;..</code>.
 * @author Sean A. Irvine
 */
public class A032884 extends A032882 {

  @Override
  protected int base() {
    return 5;
  }
}
