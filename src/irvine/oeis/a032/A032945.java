package irvine.oeis.a032;

/**
 * A032945 Numbers k whose base-10 representation Sum_{i=0..m} d(i)*10^(m-i) has d(i)=0 for all odd i. Here m is the position of the lead digit of k.
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
