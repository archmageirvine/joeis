package irvine.oeis.a010;

/**
 * A010836 Expansion of <code>Product_{k&gt;=1} (1-x^k )^31</code>.
 * @author Sean A. Irvine
 */
public class A010836 extends A010816 {

  @Override
  protected int power() {
    return 31;
  }
}
