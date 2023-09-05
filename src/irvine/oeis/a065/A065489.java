package irvine.oeis.a065;

/**
 * A065489 Decimal expansion of Product_{p prime} (1 + 1/(p^2+p-1)).
 * @author Sean A. Irvine
 */
public class A065489 extends A065468 {

  /** Construct the sequence. */
  public A065489() {
    super(new long[] {1, 0, -2}, new long[] {2, -3, 6}, 0);
    setOffset(1);
  }
}
