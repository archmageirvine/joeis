package irvine.oeis.a032;

/**
 * A032950 Numbers n such that base 15 representation <code>Sum{d(i)*15^i: i=0,1,...,m}</code> has <code>d(i)=0</code> for all odd i.
 * @author Sean A. Irvine
 */
public class A032950 extends A032937 {

  @Override
  protected int base() {
    return 15;
  }
}
