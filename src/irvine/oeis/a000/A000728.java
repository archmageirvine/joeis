package irvine.oeis.a000;

/**
 * A000728 Expansion of <code>Product_{n&gt;=1} (1-x^n)^5</code>.
 * @author Sean A. Irvine
 */
public class A000728 extends A000727 {

  @Override
  protected int power() {
    return 5;
  }
}
