package irvine.oeis.a032;

/**
 * A032945 Numbers n such that base 10 representation Sum{d(i)*10^(m-i): i=0,1,...,m} has d(i)=0 for all odd i. Here m is the position of the lead digit of n.
 * @author Sean A. Irvine
 */
public class A032945 extends A032937 {

  @Override
  protected long start() {
    return 0;
  }

  @Override
  protected int base() {
    return 10;
  }
}
