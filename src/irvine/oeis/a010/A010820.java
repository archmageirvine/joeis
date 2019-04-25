package irvine.oeis.a010;

/**
 * A010820 Expansion of <code>Product_{k&gt;=1} (1 - x^k)^13</code>.
 * @author Sean A. Irvine
 */
public class A010820 extends A010816 {

  @Override
  protected int power() {
    return 13;
  }
}
