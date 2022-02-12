package irvine.oeis.a001;

/**
 * A001490 Expand {Product_{j&gt;=1} (1 - x^j) - 1}^12 in powers of x.
 * @author Sean A. Irvine
 */
public class A001490 extends A001482 {

  @Override
  protected int power() {
    return 12;
  }
}
