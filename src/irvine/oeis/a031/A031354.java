package irvine.oeis.a031;

/**
 * A031354 8-multiplicative persistence: number of iterations of "multiply 8th powers of digits" needed to reach 0 or 1.
 * @author Sean A. Irvine
 */
public class A031354 extends A031349 {

  @Override
  protected int pow() {
    return 8;
  }
}

