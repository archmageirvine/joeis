package irvine.oeis.a032;

/**
 * A032957 Numbers n such that base 7 representation <code>Sum{d(i)*7^i: i=0,1,...,m}</code> has even <code>d(i)</code> for all odd i.
 * @author Sean A. Irvine
 */
public class A032957 extends A032953 {

  @Override
  protected int base() {
    return 7;
  }
}
