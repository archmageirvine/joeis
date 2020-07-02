package irvine.oeis.a033;

/**
 * A033065 Numbers n such that base 14 representation <code>Sum{d(i)*14^i: i=0,1,...,m}</code> has odd <code>d(i)</code> for all odd i.
 * @author Sean A. Irvine
 */
public class A033065 extends A033053 {

  @Override
  protected int base() {
    return 14;
  }
}
