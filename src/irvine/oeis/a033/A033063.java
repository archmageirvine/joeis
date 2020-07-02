package irvine.oeis.a033;

/**
 * A033063 Numbers n such that base 12 representation <code>Sum{d(i)*12^i: i=0,1,...,m}</code> has odd <code>d(i)</code> for all odd i.
 * @author Sean A. Irvine
 */
public class A033063 extends A033053 {

  @Override
  protected int base() {
    return 12;
  }
}
