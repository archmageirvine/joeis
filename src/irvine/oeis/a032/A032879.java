package irvine.oeis.a032;

/**
 * A032879 Numbers n such that base 8 representation <code>Sum{d(i)*8^i: i=0,1,...,m)</code> has <code>d(0)&gt;d(1)&lt;d(2)&gt;..</code>.
 * @author Sean A. Irvine
 */
public class A032879 extends A032874 {

  @Override
  protected int base() {
    return 8;
  }
}
