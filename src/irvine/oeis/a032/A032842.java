package irvine.oeis.a032;

/**
 * A032842 Numbers n such that base 4 representation <code>Sum{d(i)*4^i: i=0,1,...,m}</code> has <code>d(m)&lt;d(m-1)&gt;d(m-2)&lt;..</code>.
 * @author Sean A. Irvine
 */
public class A032842 extends A032841 {

  @Override
  protected long base() {
    return 4;
  }
}
