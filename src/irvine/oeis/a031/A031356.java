package irvine.oeis.a031;

/**
 * A031356 10-multiplicative persistence: number of iterations of "multiply <code>10th</code> powers of digits" needed to reach 0 or 1.
 * @author Sean A. Irvine
 */
public class A031356 extends A031349 {

  @Override
  protected int pow() {
    return 10;
  }
}
