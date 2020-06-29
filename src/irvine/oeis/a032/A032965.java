package irvine.oeis.a032;

/**
 * A032965 Numbers n such that base 15 representation <code>Sum{d(i)*15^i: i=0,1,...,m}</code> has even <code>d(i)</code> for all odd i.
 * @author Sean A. Irvine
 */
public class A032965 extends A032953 {

  @Override
  protected int base() {
    return 15;
  }
}
