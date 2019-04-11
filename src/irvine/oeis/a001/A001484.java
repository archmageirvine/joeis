package irvine.oeis.a001;

/**
 * A001484 Expansion of (Product_{j&gt;=1} (1-(-x)^j) <code>- 1)^6</code> in powers of x.
 * @author Sean A. Irvine
 */
public class A001484 extends A001482 {

  @Override
  protected int power() {
    return 6;
  }
}
