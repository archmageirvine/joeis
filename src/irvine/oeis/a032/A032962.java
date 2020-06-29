package irvine.oeis.a032;

/**
 * A032962 Numbers n such that base 12 representation <code>Sum{d(i)*12^i: i=0,1,...,m}</code> has even <code>d(i)</code> for all odd i.
 * @author Sean A. Irvine
 */
public class A032962 extends A032953 {

  @Override
  protected int base() {
    return 12;
  }
}
