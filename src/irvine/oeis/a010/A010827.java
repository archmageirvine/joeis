package irvine.oeis.a010;

/**
 * A010827 Expansion of <code>Product_{k&gt;=1} (1 - x^k)^21</code>.
 * @author Sean A. Irvine
 */
public class A010827 extends A010816 {

  @Override
  protected int power() {
    return 21;
  }
}
