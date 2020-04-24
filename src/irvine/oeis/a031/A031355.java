package irvine.oeis.a031;

/**
 * A031355 9-multiplicative persistence: number of iterations of "multiply 9th powers of digits" needed to reach 0 or 1.
 * @author Sean A. Irvine
 */
public class A031355 extends A031349 {

  @Override
  protected int pow() {
    return 9;
  }
}

