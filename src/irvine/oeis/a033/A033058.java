package irvine.oeis.a033;

/**
 * A033058 Numbers n such that base 7 representation <code>Sum{d(i)*7^i: i=0,1,...,m}</code> has odd <code>d(i)</code> for all odd i.
 * @author Sean A. Irvine
 */
public class A033058 extends A033053 {

  @Override
  protected int base() {
    return 7;
  }
}
