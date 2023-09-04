package irvine.oeis.a065;

/**
 * A065471 Decimal expansion of Product_{p prime} (1 - 1/(p^2*(p^2-1))).
 * @author Sean A. Irvine
 */
public class A065471 extends A065468 {

  /** Construct the sequence. */
  public A065471() {
    super(new long[] {-1, 0, 0, 0, 2, 0}, new long[] {-4, 0, -6, 0, -12, 0}, 2);
  }
}
