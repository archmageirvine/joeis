package irvine.oeis.a032;

/**
 * A032954 Numbers n such that base 4 representation <code>Sum{d(i)*4^i: i=0,1,...,m}</code> has even <code>d(i)</code> for all odd i.
 * @author Sean A. Irvine
 */
public class A032954 extends A032953 {

  @Override
  protected int base() {
    return 4;
  }
}
