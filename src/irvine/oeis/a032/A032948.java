package irvine.oeis.a032;

/**
 * A032948 Numbers n such that base 13 representation Sum{d(i)*13^(m-i): i=0,1,...,m} has d(i)=0 for all odd i. Here m is the position of the leading bit of n.
 * @author Sean A. Irvine
 */
public class A032948 extends A032937 {

  @Override
  protected int base() {
    return 13;
  }
}
