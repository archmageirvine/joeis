package irvine.oeis.a065;

/**
 * A065467 Decimal expansion of Product_{p prime} (1 - 1/(p^4*(p+1))).
 * @author Sean A. Irvine
 */
public class A065467 extends A065468 {

  /** Construct the sequence. */
  public A065467() {
    super(new long[] {1, 1, 0, 0, -1, -2}, new long[] {-5, 6, -7, 8, -9, 5}, 3);
  }
}
