package irvine.oeis.a001;

/**
 * A001483 Expansion of (Product_{j&gt;=1} (1-(-x)^j) - 1)^5 in powers of x.
 * @author Sean A. Irvine
 */
public class A001483 extends A001482 {

  @Override
  protected int power() {
    return 5;
  }
}
