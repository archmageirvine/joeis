package irvine.oeis.a001;

/**
 * A001490 Expand <code>{Product_{j=1..inf} (1-x^j) - 1 }^12</code> in powers of <code>x</code>.
 * @author Sean A. Irvine
 */
public class A001490 extends A001482 {

  @Override
  protected int power() {
    return 12;
  }
}
