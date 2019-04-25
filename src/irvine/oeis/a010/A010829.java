package irvine.oeis.a010;

/**
 * A010829 Expansion of <code>Product_{k&gt;=1} (1 - x^k)^23</code>.
 * @author Sean A. Irvine
 */
public class A010829 extends A010816 {

  @Override
  protected int power() {
    return 23;
  }
}
