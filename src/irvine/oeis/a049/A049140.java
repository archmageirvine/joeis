package irvine.oeis.a049;

/**
 * A049140 Revert transform of 1 - x - x^3.
 *
 * @author Georg Fischer
 */
public class A049140 extends A049150 {

  /**
   * Construct the sequence
   */
  public A049140() {
    super(1, new long[]{+1, -1, +0, -1}, new long[]{0});
  }
}
