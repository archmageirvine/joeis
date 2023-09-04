package irvine.oeis.a065;

/**
 * A065469 Decimal expansion of Product_{p prime} (1 - 1/(p^2-1)).
 * @author Sean A. Irvine
 */
public class A065469 extends A065468 {

  /** Construct the sequence. */
  public A065469() {
    super(new long[] {-2, 0, 3, 0}, new long[] {0, 0, -2, 0}, -2);
  }
}
