package irvine.oeis.a032;

/**
 * A032948 Numbers k whose base-13 representation Sum_{i=0..m} d(i)*13^(m-i) has d(i)=0 for all odd i. Here m is the position of the leading bit of k.
 * @author Sean A. Irvine
 */
public class A032948 extends A032937 {

  @Override
  protected int base() {
    return 13;
  }
}
