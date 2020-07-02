package irvine.oeis.a033;

/**
 * A033060 Numbers n such that base 9 representation <code>Sum{d(i)*9^i: i=0,1,...,m}</code> has odd <code>d(i)</code> for all odd i.
 * @author Sean A. Irvine
 */
public class A033060 extends A033053 {

  @Override
  protected int base() {
    return 9;
  }
}
