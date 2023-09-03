package irvine.oeis.a065;

/**
 * A065466 Decimal expansion of Product_{p prime} (1 - 1/(p^3*(p+1))).
 * @author Sean A. Irvine
 */
public class A065466 extends A065468 {

  /** Construct the sequence. */
  public A065466() {
    super(new long[] {1, 1, 0, -1, -2}, new long[] {-4, 5, -6, 7, -12}, 2);
  }
}
