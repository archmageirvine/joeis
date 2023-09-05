package irvine.oeis.a065;

/**
 * A065483 Decimal expansion of totient constant Product_{p prime} (1 + 1/(p^2*(p-1))).
 * @author Sean A. Irvine
 */
public class A065483 extends A065468 {

  /** Construct the sequence. */
  public A065483() {
    super(new long[] {1, -1, -1, 2}, new long[] {3, 4, 5, 3}, 1);
    setOffset(1);
  }
}
