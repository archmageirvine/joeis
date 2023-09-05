package irvine.oeis.a065;

/**
 * A065487 Decimal expansion of Product_{p prime} (1 + 1/(p*(p^2-1))).
 * @author Sean A. Irvine
 */
public class A065487 extends A065468 {

  /** Construct the sequence. */
  public A065487() {
    super(new long[] {1, -1, -1, 2, 0}, new long[] {3, 0, 5, -3, 7}, 1);
    setOffset(1);
  }
}
