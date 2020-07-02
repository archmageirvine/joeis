package irvine.oeis.a033;

/**
 * A033062 Numbers n such that base 11 representation <code>Sum{d(i)*11^i: i=0,1,...,m}</code> has odd <code>d(i)</code> for all odd i.
 * @author Sean A. Irvine
 */
public class A033062 extends A033053 {

  @Override
  protected int base() {
    return 11;
  }
}
