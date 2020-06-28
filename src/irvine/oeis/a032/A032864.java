package irvine.oeis.a032;

/**
 * A032864 Numbers n such that base 9 representation <code>Sum{d(i)*9^i: i=0,1,...,m)</code> has <code>d(m) &gt; d(m-1) &lt; d(m-2) &gt; ..</code>.
 * @author Sean A. Irvine
 */
public class A032864 extends A032847 {

  @Override
  protected boolean initialDirection() {
    return false;
  }
}
