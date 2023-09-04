package irvine.oeis.a065;

/**
 * A065485 Decimal expansion of Murata's constant Product_{p prime}(1 + 1/(p-1)^2).
 * @author Sean A. Irvine
 */
public class A065485 extends A065468 {

  /** Construct the sequence. */
  public A065485() {
    super(new long[] {2, -4, 3}, new long[] {0, 2, 6}, -1);
  }
}
