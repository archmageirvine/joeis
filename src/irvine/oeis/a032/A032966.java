package irvine.oeis.a032;

/**
 * A032966 Numbers n such that base 16 representation <code>Sum{d(i)*16^i: i=0,1,...,m}</code> has even <code>d(i)</code> for all odd i.
 * @author Sean A. Irvine
 */
public class A032966 extends A032953 {

  @Override
  protected int base() {
    return 16;
  }
}
