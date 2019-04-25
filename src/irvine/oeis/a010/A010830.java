package irvine.oeis.a010;

/**
 * A010830 Expansion of <code>Product_{k&gt;=1} (1-x^k )^25</code>.
 * @author Sean A. Irvine
 */
public class A010830 extends A010816 {

  @Override
  protected int power() {
    return 25;
  }
}
