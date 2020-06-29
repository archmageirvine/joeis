package irvine.oeis.a032;

/**
 * A032948 Numbers n such that base 13 representation <code>Sum{d(i)*13^(m-i): i=0,1,...,m}</code> has <code>d(i)=0</code> for all odd i. Here m is the position of the leading bit of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A032948 extends A032937 {

  @Override
  protected int base() {
    return 13;
  }
}
