package irvine.oeis.a032;

/**
 * A032844 Numbers n such that base 6 representation <code>Sum{d(i)*6^i: i=0,1,...,m}</code> has <code>d(m)&lt;d(m-1)&gt;d(m-2)&lt;..</code>.
 * @author Sean A. Irvine
 */
public class A032844 extends A032841 {

  @Override
  protected long base() {
    return 6;
  }
}
