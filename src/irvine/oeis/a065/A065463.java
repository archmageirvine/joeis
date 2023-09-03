package irvine.oeis.a065;

/**
 * A065463 Decimal expansion of Product_{p prime} (1 - 1/(p*(p+1))).
 * @author Sean A. Irvine
 */
public class A065463 extends A065468 {

  /** Construct the sequence. */
  public A065463() {
    super(new long[] {1, 0, -2}, new long[] {-2, 3, -6}, 0);
  }
}
