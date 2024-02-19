package irvine.oeis.a004;

/**
 * A004290 Least positive multiple of n that when written in base 10 uses only 0's and 1's.
 * @author Sean A. Irvine
 */
public class A004290 extends A004283 {

  @Override
  protected int base() {
    return 10;
  }
}
