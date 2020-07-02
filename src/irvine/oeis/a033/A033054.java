package irvine.oeis.a033;

/**
 * A033054 Numbers n such that base 3 representation <code>Sum{d(i)*3^i: i=0,1,...,m}</code> has <code>d(i)=1</code> for m-i odd.
 * @author Sean A. Irvine
 */
public class A033054 extends A033053 {

  @Override
  protected int base() {
    return 3;
  }
}
