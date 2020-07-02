package irvine.oeis.a033;

/**
 * A033057 Numbers n such that base 6 representation <code>Sum{d(i)*6^i: i=0,1,...,m}</code> has odd <code>d(i)</code> for all odd i.
 * @author Sean A. Irvine
 */
public class A033057 extends A033053 {

  @Override
  protected int base() {
    return 6;
  }
}
