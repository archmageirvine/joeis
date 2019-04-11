package irvine.oeis.a001;

/**
 * A001487 Expand {Product_{j=1..inf} <code>(1-x^j) - 1 }^9</code> in powers of x.
 * @author Sean A. Irvine
 */
public class A001487 extends A001482 {

  @Override
  protected int power() {
    return 9;
  }
}
