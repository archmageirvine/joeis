package irvine.oeis.a010;

/**
 * A010823 Expansion of <code>Product_{k&gt;=1} (1 - x^k)^17</code>.
 * @author Sean A. Irvine
 */
public class A010823 extends A010816 {

  @Override
  protected int power() {
    return 17;
  }
}
