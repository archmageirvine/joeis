package irvine.oeis.a032;

/**
 * A032955 Numbers n such that base 5 representation <code>Sum{d(i)*5^i: i=0,1,...,m}</code> has even <code>d(i)</code> for all odd i.
 * @author Sean A. Irvine
 */
public class A032955 extends A032953 {

  @Override
  protected int base() {
    return 5;
  }
}
