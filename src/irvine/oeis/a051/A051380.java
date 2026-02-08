package irvine.oeis.a051;

/**
 * A051380 Generalized Stirling number triangle of first kind read by rows: T(n, k) = [x^k] Product_{m=1..n} (x - m - r), with r = 8.
 * @author Sean A. Irvine
 */
public class A051380 extends A051338 {

  @Override
  protected long add() {
    return 8;
  }
}
