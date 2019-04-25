package irvine.oeis.a010;

/**
 * A010826 Expansion of <code>Product_{k&gt;=1} (1 - x^k)^20</code>.
 * @author Sean A. Irvine
 */
public class A010826 extends A010816 {

  @Override
  protected int power() {
    return 20;
  }
}
