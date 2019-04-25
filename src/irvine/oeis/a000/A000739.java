package irvine.oeis.a000;

/**
 * A000739 Expansion of <code>Product_{k&gt;=1} (1 - x^k)^16</code>.
 * @author Sean A. Irvine
 */
public class A000739 extends A000727 {

  @Override
  protected int power() {
    return 16;
  }
}
