package irvine.oeis.a010;

/**
 * A010819 Expansion of <code>Product_{k&gt;=1} (1 - x^k)^11</code>.
 * @author Sean A. Irvine
 */
public class A010819 extends A010816 {

  @Override
  protected int power() {
    return 11;
  }
}
