package irvine.oeis.a010;

/**
 * A010841 Expansion of <code>Product_{k&gt;=1} (1-x^k)^64</code>.
 * @author Sean A. Irvine
 */
public class A010841 extends A010816 {

  @Override
  protected int power() {
    return 64;
  }
}
