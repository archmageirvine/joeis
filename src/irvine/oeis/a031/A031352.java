package irvine.oeis.a031;

/**
 * A031352 6-multiplicative persistence: number of iterations of "multiply 6th powers of digits" needed to reach 0 or 1.
 * @author Sean A. Irvine
 */
public class A031352 extends A031349 {

  @Override
  protected int pow() {
    return 6;
  }
}

