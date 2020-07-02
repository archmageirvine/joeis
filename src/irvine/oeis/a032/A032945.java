package irvine.oeis.a032;

/**
 * A032945 Numbers n such that base 10 representation <code>Sum{d(i)*10^(m-i): i=0,1,...,m}</code> has <code>d(i)=0</code> for all odd i. Here m is the position of the lead digit of <code>n</code>.
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
