package irvine.oeis.a032;

/**
 * A032938 Numbers n such that base 3 representation <code>Sum{d(i)*3^i: i=0,1,...,m}</code> has <code>d(i)=0</code> for all odd i.
 * @author Sean A. Irvine
 */
public class A032938 extends A032937 {

  @Override
  protected int base() {
    return 3;
  }
}
