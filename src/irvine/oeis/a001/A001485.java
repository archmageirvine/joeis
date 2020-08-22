package irvine.oeis.a001;

/**
 * A001485 Expand {Product_{j=1..inf} (1-x^j) - 1 }^7 in powers of x.
 * @author Sean A. Irvine
 */
public class A001485 extends A001482 {

  @Override
  protected int power() {
    return 7;
  }
}
