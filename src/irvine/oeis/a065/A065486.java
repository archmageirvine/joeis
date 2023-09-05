package irvine.oeis.a065;

/**
 * A065486 Decimal expansion of Product_{p prime} (1 + 1/(p+1)^2).
 * @author Sean A. Irvine
 */
public class A065486 extends A065468 {

  /** Construct the sequence. */
  public A065486() {
    super(new long[] {-2, -4, -3}, new long[] {0, 0, 2}, -2);
    setOffset(1);
  }
}
