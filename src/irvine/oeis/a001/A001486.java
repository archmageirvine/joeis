package irvine.oeis.a001;

/**
 * A001486 Expand {Product_{j=1..inf} <code>(1-x^j) - 1 }^8</code> in powers of x.
 * @author Sean A. Irvine
 */
public class A001486 extends A001482 {

  @Override
  protected int power() {
    return 8;
  }
}
