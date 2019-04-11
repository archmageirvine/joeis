package irvine.oeis.a001;

/**
 * A001488 Expand {Product_{j=1..inf} <code>(1-x^j) - 1 }^10</code> in powers of x.
 * @author Sean A. Irvine
 */
public class A001488 extends A001482 {

  @Override
  protected int power() {
    return 10;
  }
}
