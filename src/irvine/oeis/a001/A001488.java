package irvine.oeis.a001;

/**
 * A001488 Expansion of (Product_{j&gt;=1} (1-(-x)^j) - 1)^10 in powers of x.
 * @author Sean A. Irvine
 */
public class A001488 extends A001482 {

  @Override
  protected int power() {
    return 10;
  }
}
