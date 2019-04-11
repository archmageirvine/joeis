package irvine.oeis.a010;

/**
 * A010818 Expansion of Product <code>(1 - x^k)^10</code> in powers of x.
 * @author Sean A. Irvine
 */
public class A010818 extends A010816 {

  @Override
  protected int power() {
    return 10;
  }
}
