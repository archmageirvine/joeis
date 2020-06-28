package irvine.oeis.a032;

/**
 * A032848 Numbers n such that base 10 representation <code>Sum{d(i)*10^i: i=0,1,...,m}</code> has <code>d(m)&lt;d(m-1)&gt;d(m-2)&lt;..</code>.
 * @author Sean A. Irvine
 */
public class A032848 extends A032841 {

  @Override
  protected long base() {
    return 10;
  }
}
