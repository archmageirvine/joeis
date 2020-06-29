package irvine.oeis.a032;

/**
 * A032959 Numbers n such that base 9 representation <code>Sum{d(i)*9^i: i=0,1,...,m}</code> has even <code>d(i)</code> for all odd i.
 * @author Sean A. Irvine
 */
public class A032959 extends A032953 {

  @Override
  protected int base() {
    return 9;
  }
}
