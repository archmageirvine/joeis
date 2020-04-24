package irvine.oeis.a031;

/**
 * A031351 5-multiplicative persistence: number of iterations of "multiply 5th powers of digits" needed to reach 0 or 1.
 * @author Sean A. Irvine
 */
public class A031351 extends A031349 {

  @Override
  protected int pow() {
    return 5;
  }
}

