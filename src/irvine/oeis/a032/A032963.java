package irvine.oeis.a032;

/**
 * A032963 Numbers n such that base 13 representation <code>Sum{d(i)*13^i: i=0,1,...,m}</code> has even <code>d(i)</code> for all odd i.
 * @author Sean A. Irvine
 */
public class A032963 extends A032953 {

  @Override
  protected int base() {
    return 13;
  }
}
