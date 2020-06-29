package irvine.oeis.a032;

/**
 * A032960 Numbers n such that base 10 representation <code>Sum{d(i)*10^i: i=0,1,...,m}</code> has even <code>d(i)</code> for all odd i.
 * @author Sean A. Irvine
 */
public class A032960 extends A032953 {

  @Override
  protected int base() {
    return 10;
  }
}
