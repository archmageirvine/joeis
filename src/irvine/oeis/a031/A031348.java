package irvine.oeis.a031;

/**
 * A031348 2-multiplicative persistence: number of iterations of "multiply 2nd powers of digits" needed to reach 0 or 1.
 * @author Sean A. Irvine
 */
public class A031348 extends A031349 {

  @Override
  protected int pow() {
    return 2;
  }
}

