package irvine.oeis.a051;

/**
 * A051379 Generalized Stirling number triangle of first kind read by rows: T(n, k) = [x^k] Product_{m=1..n} (x - m - r), with r = 7.
 * @author Sean A. Irvine
 */
public class A051379 extends A051338 {

  @Override
  protected long add() {
    return 7;
  }
}
