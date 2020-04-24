package irvine.oeis.a031;

/**
 * A031353 7-multiplicative persistence: number of iterations of "multiply 7th powers of digits" needed to reach 0 or 1.
 * @author Sean A. Irvine
 */
public class A031353 extends A031349 {

  @Override
  protected int pow() {
    return 7;
  }
}

