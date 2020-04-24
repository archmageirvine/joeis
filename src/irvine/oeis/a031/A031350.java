package irvine.oeis.a031;

/**
 * A031350 4-multiplicative persistence: number of iterations of "multiply 4th powers of digits" needed to reach 0 or 1.
 * @author Sean A. Irvine
 */
public class A031350 extends A031349 {

  @Override
  protected int pow() {
    return 4;
  }
}

