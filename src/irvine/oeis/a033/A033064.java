package irvine.oeis.a033;

/**
 * A033064 Numbers n such that base 13 representation <code>Sum{d(i)*13^i: i=0,1,...,m}</code> has odd <code>d(i)</code> for all odd i.
 * @author Sean A. Irvine
 */
public class A033064 extends A033053 {

  @Override
  protected int base() {
    return 13;
  }
}
