package irvine.oeis.a033;

/**
 * A033056 Numbers n such that base 5 representation <code>Sum{d(i)*5^i: i=0,1,...,m}</code> has odd <code>d(i)</code> for all odd i.
 * @author Sean A. Irvine
 */
public class A033056 extends A033053 {

  @Override
  protected int base() {
    return 5;
  }
}
