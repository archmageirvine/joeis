package irvine.oeis.a032;

/**
 * A032956 Numbers n such that base 6 representation <code>Sum{d(i)*6^i: i=0,1,...,m}</code> has even <code>d(i)</code> for all odd i.
 * @author Sean A. Irvine
 */
public class A032956 extends A032953 {

  @Override
  protected int base() {
    return 6;
  }
}
