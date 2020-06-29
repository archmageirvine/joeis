package irvine.oeis.a032;

/**
 * A032940 Numbers n such that base 5 representation <code>Sum{d(i)*5^i: i=0,1,...,m}</code> has <code>d(i)=0</code> for all odd i.
 * @author Sean A. Irvine
 */
public class A032940 extends A032937 {

  @Override
  protected int base() {
    return 5;
  }
}
