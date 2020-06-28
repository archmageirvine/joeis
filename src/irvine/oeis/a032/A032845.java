package irvine.oeis.a032;

/**
 * A032845 Numbers n such that base 7 representation <code>Sum{d(i)*7^i: i=0,1,...,m}</code> has <code>d(m)&lt;d(m-1)&gt;d(m-2)&lt;..</code>.
 * @author Sean A. Irvine
 */
public class A032845 extends A032841 {

  @Override
  protected long base() {
    return 7;
  }
}
