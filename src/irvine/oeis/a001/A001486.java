package irvine.oeis.a001;

/**
 * A001486 Expand {Product_{j=1..inf} (1-x^j) <code>- 1 }^8</code> in powers of x.
 * @author Sean A. Irvine
 */
public class A001486 extends A001482 {

  @Override
  protected int power() {
    return 8;
  }
}
