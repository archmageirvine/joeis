package irvine.oeis.a032;

/**
 * A032860 Numbers n such that base 5 representation <code>Sum{d(i)*5^i: i=0,1,...,m)</code> has <code>d(m)&gt;d(m-1)&lt;d(m-2)&gt;..</code>.
 * @author Sean A. Irvine
 */
public class A032860 extends A032843 {

  @Override
  protected boolean initialDirection() {
    return false;
  }
}
